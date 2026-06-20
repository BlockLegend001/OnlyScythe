package com.blocklegend001.onlyscythe.item.custom;

import com.blocklegend001.onlyscythe.util.RadiusMap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class Scythe extends HoeItem {
    public Scythe(ToolMaterial material, float pAttackDamageModifier, float pAttackSpeedModifier, Properties properties) {
        super(material, pAttackDamageModifier, pAttackSpeedModifier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltip, Consumer<Component> componentConsumer, TooltipFlag flag) {
        int radius = getRadiusForScythe(stack);
        int width = radius * 2 + 1;

        MutableComponent text = Component.literal("Harvest Radius: ")
                .withStyle(ChatFormatting.GRAY)
                .append(Component.literal(width + "×" + width)
                        .withStyle(ChatFormatting.YELLOW));

        componentConsumer.accept(text);

        super.appendHoverText(stack, context, tooltip, componentConsumer, flag);
    }

    private int getRadiusForScythe(ItemStack stack) {
        if (RadiusMap.SCYTHE_RADIUS_MAP.containsKey(stack.getItem())) {
            return RadiusMap.SCYTHE_RADIUS_MAP.get(stack.getItem());
        }
        return 0;
    }
}
