package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    private static List<ResourceKey<Block>> keys(Block... blocks) {
        return Arrays.stream(blocks)
                .map(block -> block.builtInRegistryHolder().key())
                .collect(Collectors.toList());
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        builder(ModTags.SCYTHE_BLOCKS)
                .forceAddTag(BlockTags.FLOWERS)
                .addAll(keys(
                        Blocks.SHORT_GRASS,
                        Blocks.TALL_GRASS,
                        Blocks.FERN,
                        Blocks.LARGE_FERN,
                        Blocks.DEAD_BUSH,
                        Blocks.CRIMSON_ROOTS,
                        Blocks.WARPED_ROOTS,
                        Blocks.NETHER_SPROUTS,
                        Blocks.SWEET_BERRY_BUSH));
    }
}