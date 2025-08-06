package com.blocklegend001.onlyscythe.item.custom;

import com.blocklegend001.onlyscythe.config.ScytheConfig;
import com.blocklegend001.onlyscythe.item.ModItems;
import com.blocklegend001.onlyscythe.util.RadiusMap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class Scythe extends HoeItem {
    public Scythe(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        int radius = getRadiusForScythe(stack);
        int width = radius * 2 + 1;

        MutableComponent text = Component.literal("Harvest Radius: ")
                .withStyle(ChatFormatting.GRAY)
                .append(Component.literal(width + "×" + width)
                        .withStyle(ChatFormatting.YELLOW));

        tooltip.add(text);

        super.appendHoverText(stack, context, tooltip, flag);
    }

    private int getRadiusForScythe(ItemStack stack) {
        if (RadiusMap.SCYTHE_RADIUS_MAP.containsKey(stack.getItem())) {
            return RadiusMap.SCYTHE_RADIUS_MAP.get(stack.getItem());
        }
        return 0;
    }
}
