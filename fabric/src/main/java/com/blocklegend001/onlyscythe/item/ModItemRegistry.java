package com.blocklegend001.onlyscythe.item;

import com.blocklegend001.onlyscythe.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModItemRegistry {
    public static void registerItems() {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "wooden_scythe"), ModItems.WOODEN_SCYTHE);
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "stone_scythe"), ModItems.STONE_SCYTHE);
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "golden_scythe"), ModItems.GOLDEN_SCYTHE);
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "iron_scythe"), ModItems.IRON_SCYTHE);
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "diamond_scythe"), ModItems.DIAMOND_SCYTHE);
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "netherite_scythe"), ModItems.NETHERITE_SCYTHE);
    }
}
