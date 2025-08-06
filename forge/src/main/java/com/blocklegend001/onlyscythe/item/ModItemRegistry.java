package com.blocklegend001.onlyscythe.item;

import com.blocklegend001.onlyscythe.Constants;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> WOODEN_SCYTHE = ITEMS.register("wooden_scythe", () -> ModItems.WOODEN_SCYTHE);
    public static final RegistryObject<Item> STONE_SCYTHE = ITEMS.register("stone_scythe", () -> ModItems.STONE_SCYTHE);
    public static final RegistryObject<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe", () -> ModItems.GOLDEN_SCYTHE);
    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe", () -> ModItems.IRON_SCYTHE);
    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe", () -> ModItems.DIAMOND_SCYTHE);
    public static final RegistryObject<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe", () -> ModItems.NETHERITE_SCYTHE);
}
