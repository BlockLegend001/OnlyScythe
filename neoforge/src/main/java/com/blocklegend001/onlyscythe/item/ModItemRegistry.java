package com.blocklegend001.onlyscythe.item;

import com.blocklegend001.onlyscythe.Constants;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    public static final DeferredItem<Item> WOODEN_SCYTHE = ITEMS.register("wooden_scythe", () -> ModItems.WOODEN_SCYTHE);
    public static final DeferredItem<Item> STONE_SCYTHE = ITEMS.register("stone_scythe", () -> ModItems.STONE_SCYTHE);
    public static final DeferredItem<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe", () -> ModItems.GOLDEN_SCYTHE);
    public static final DeferredItem<Item> IRON_SCYTHE = ITEMS.register("iron_scythe", () -> ModItems.IRON_SCYTHE);
    public static final DeferredItem<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe", () -> ModItems.DIAMOND_SCYTHE);
    public static final DeferredItem<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe", () -> ModItems.NETHERITE_SCYTHE);
}
