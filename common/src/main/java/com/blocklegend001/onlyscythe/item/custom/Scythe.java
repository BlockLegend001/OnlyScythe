package com.blocklegend001.onlyscythe.item.custom;

import com.blocklegend001.onlyscythe.util.RadiusMap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Scythe extends HoeItem {
    public Scythe(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        int radius = getRadiusForScythe(stack);
        int width = radius * 2 + 1;

        MutableComponent text = Component.literal("Harvest Radius: ")
                .withStyle(ChatFormatting.GRAY)
                .append(Component.literal(width + "×" + width)
                        .withStyle(ChatFormatting.YELLOW));

        tooltipComponents.add(text);

        super.appendHoverText(stack, level, tooltipComponents, isAdvanced);
    }

    private int getRadiusForScythe(ItemStack stack) {
        if (RadiusMap.SCYTHE_RADIUS_MAP.containsKey(stack.getItem())) {
            return RadiusMap.SCYTHE_RADIUS_MAP.get(stack.getItem());
        }
        return 0;
    }
}
