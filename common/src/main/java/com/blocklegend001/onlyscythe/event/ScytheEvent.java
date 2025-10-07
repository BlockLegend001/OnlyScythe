package com.blocklegend001.onlyscythe.event;

import com.blocklegend001.onlyscythe.util.ModTags;
import com.blocklegend001.onlyscythe.util.RadiusMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.*;

public class ScytheEvent {

    public static InteractionResult handleAttackBlock(Player player, Level world, InteractionHand hand, BlockPos blockPos, Direction direction) {
        if (world.isClientSide()) return InteractionResult.PASS;

        ItemStack stack = player.getItemInHand(hand);
        Item item = stack.getItem();

        if (player.isCrouching() || !RadiusMap.SCYTHE_RADIUS_MAP.containsKey(item)) {
            return InteractionResult.PASS;
        }

        BlockState targetedBlock = world.getBlockState(blockPos);
        if (!isValidInitialTarget(targetedBlock)) return InteractionResult.PASS;

        int radius = RadiusMap.SCYTHE_RADIUS_MAP.get(item);
        boolean didWork = false;

        for (BlockPos pos : BlockPos.betweenClosed(
                blockPos.offset(-radius, 0, -radius),
                blockPos.offset(radius, 0, radius))) {

            didWork |= tryBreakBlock(player, world, hand, pos.immutable(), stack);
        }

        return didWork ? InteractionResult.SUCCESS : InteractionResult.PASS;
    }

    private static boolean isValidInitialTarget(BlockState state) {
        return state.is(BlockTags.CROPS)
                || state.is(Blocks.NETHER_WART)
                || state.is(ModTags.SCYTHE_BLOCKS)
                || state.is(Blocks.COCOA)
                || isTallPlant(state);
    }

    private static boolean isFullyGrownCrop(BlockState state) {
        for (Property<?> prop : state.getProperties()) {
            if (prop instanceof IntegerProperty intProp && prop.getName().equals("age")) {
                int current = state.getValue(intProp);
                int max = Collections.max(intProp.getPossibleValues());
                return current == max;
            }
        }
        return true;
    }

    private static boolean isTallPlant(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.SUGAR_CANE || block == Blocks.CACTUS || block == Blocks.BAMBOO || block == Blocks.KELP_PLANT;
    }

    private static boolean isBaseOfTallPlant(Level world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (!isTallPlant(state)) return false;

        BlockPos below = pos.below();
        BlockState belowState = world.getBlockState(below);
        return !isTallPlant(belowState);
    }

    private static boolean tryBreakBlock(Player player, Level world, InteractionHand hand, BlockPos pos, ItemStack tool) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        boolean isCrop = state.is(BlockTags.CROPS);
        boolean isWart = block == Blocks.NETHER_WART;
        boolean isCocoa = block == Blocks.COCOA;
        boolean isCustom = state.is(ModTags.SCYTHE_BLOCKS);
        boolean isTall = isTallPlant(state);

        if (!(isCrop || isWart || isCocoa || isCustom || isTall)) return false;
        if (!world.mayInteract(player, pos)) return false;

        boolean fullyGrown = isFullyGrownCrop(state);
        if ((isCrop || isWart || isCocoa || isCustom) && !fullyGrown && !player.isCrouching()) {
            return true;
        }

        if (isTall && isBaseOfTallPlant(world, pos)) {
            if (!player.isShiftKeyDown() || !player.isCrouching()) {
                return true;
            }
        }

        if (world instanceof ServerLevel serverLevel) {
            Block.dropResources(state, serverLevel, pos, world.getBlockEntity(pos), player, tool);
        }

        world.removeBlock(pos, false);

        if (isCrop || isWart || isCocoa) {
            ItemStack seedStack = state.getCloneItemStack(world, pos, false);
            boolean hasSeed = false;

            Inventory inv = player.getInventory();
            for (int i = 0; i < inv.getContainerSize(); i++) {
                ItemStack invStack = inv.getItem(i);
                if (ItemStack.isSameItem(invStack, seedStack) && invStack.getCount() > 0) {
                    hasSeed = true;
                    invStack.shrink(1);
                    break;
                }
            }

            if (!seedStack.isEmpty() && hasSeed) {
                world.setBlock(pos, block.defaultBlockState(), 3);
            }
        }

        tool.hurtAndBreak(1, player, InteractionHand.MAIN_HAND);
        return true;
    }
}