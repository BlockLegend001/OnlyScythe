package com.blocklegend001.onlyscythe.util;

import com.blocklegend001.onlyscythe.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> SCYTHE_BLOCKS = modBlockTag("scythe_blocks");

    public static final TagKey<Item> WOODEN_SCYTHE = modItemTag("wooden_scythe");
    public static final TagKey<Item> STONE_SCYTHE = modItemTag("stone_scythe");
    public static final TagKey<Item> COPPER_SCYTHE = modItemTag("copper_scythe");
    public static final TagKey<Item> GOLDEN_SCYTHE = modItemTag("golden_scythe");
    public static final TagKey<Item> IRON_SCYTHE = modItemTag("iron_scythe");
    public static final TagKey<Item> DIAMOND_SCYTHE = modItemTag("diamond_scythe");
    public static final TagKey<Item> NETHERITE_SCYTHE = modItemTag("netherite_scythe");

    public static TagKey<Block> blockTag(Identifier tagLoc) {
        return TagKey.create(Registries.BLOCK, tagLoc);
    }

    public static TagKey<Item> itemTag(Identifier tagLog) {
        return TagKey.create(Registries.ITEM, tagLog);
    }

    private static TagKey<Block> modBlockTag(String tagName) {
        return ModTags.blockTag(Identifier.fromNamespaceAndPath(Constants.MOD_ID, tagName));
    }

    private static TagKey<Item> modItemTag(String tagName) {
        return ModTags.itemTag(Identifier.fromNamespaceAndPath(Constants.MOD_ID, tagName));
    }
}
