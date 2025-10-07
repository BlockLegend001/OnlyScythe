package com.blocklegend001.onlyscythe.util;

import com.blocklegend001.onlyscythe.config.ScytheConfig;
import com.blocklegend001.onlyscythe.item.ModItems;
import net.minecraft.world.item.Item;

import java.util.Map;

public class RadiusMap {
    public static final Map<Item, Integer> SCYTHE_RADIUS_MAP = Map.of(
            ModItems.WOODEN_SCYTHE, ScytheConfig.WoodenRadius,
            ModItems.STONE_SCYTHE, ScytheConfig.StoneRadius,
            ModItems.GOLDEN_SCYTHE, ScytheConfig.GoldRadius,
            ModItems.IRON_SCYTHE, ScytheConfig.IronRadius,
            ModItems.DIAMOND_SCYTHE, ScytheConfig.DiamondRadius,
            ModItems.NETHERITE_SCYTHE, ScytheConfig.NetheriteRadius
    );
}
