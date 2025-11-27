package com.blocklegend001.onlyscythe.item;

import com.blocklegend001.onlyscythe.item.custom.Scythe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class ModItems {
    public static final Item WOODEN_SCYTHE = new Scythe(Tiers.WOOD, 1, -2.8F, new Item.Properties());
    public static final Item STONE_SCYTHE = new Scythe(Tiers.STONE, 1, -2.8F, new Item.Properties());
    public static final Item GOLDEN_SCYTHE = new Scythe(Tiers.GOLD, 1, -2.8F, new Item.Properties());
    public static final Item IRON_SCYTHE = new Scythe(Tiers.IRON, 1, -2.8F, new Item.Properties());
    public static final Item DIAMOND_SCYTHE = new Scythe(Tiers.DIAMOND, 1, -2.8F, new Item.Properties());
    public static final Item NETHERITE_SCYTHE = new Scythe(Tiers.NETHERITE, 1, -2.8F, new Item.Properties().fireResistant());
}
