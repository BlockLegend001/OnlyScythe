package com.blocklegend001.onlyscythe.item;

import com.blocklegend001.onlyscythe.Constants;
import com.blocklegend001.onlyscythe.item.custom.Scythe;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class ModItems {
    public static final Item WOODEN_SCYTHE = new Scythe(ToolMaterial.WOOD, 0F, -3.0F, new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "wooden_scythe"))));

    public static final Item STONE_SCYTHE = new Scythe(ToolMaterial.STONE, -1.0F, -2.0F,  new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "stone_scythe"))));

    public static final Item GOLDEN_SCYTHE = new Scythe(ToolMaterial.GOLD, 0.0F, -3.0F,  new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "golden_scythe"))));

    public static final Item IRON_SCYTHE = new Scythe(ToolMaterial.IRON, -2.0F, -1.0F,  new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "iron_scythe"))));

    public static final Item DIAMOND_SCYTHE = new Scythe(ToolMaterial.DIAMOND, -3.0F, -0F,  new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "diamond_scythe"))));

    public static final Item NETHERITE_SCYTHE = new Scythe(ToolMaterial.NETHERITE, -4.0F, -0F,  new Item.Properties().fireResistant()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "netherite_scythe"))));

}