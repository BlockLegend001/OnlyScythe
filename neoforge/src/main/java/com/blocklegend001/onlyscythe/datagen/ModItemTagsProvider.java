package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.item.ModItems;
import com.blocklegend001.onlyscythe.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends VanillaItemTagsProvider {
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());

        tag(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());

        tag(ItemTags.HOES).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());

        tag(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());

        tag(Tags.Items.TOOLS).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key())
                .add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());


        tag(ModTags.WOODEN_SCYTHE).add(ModItems.WOODEN_SCYTHE.builtInRegistryHolder().key());
        tag(ModTags.STONE_SCYTHE).add(ModItems.STONE_SCYTHE.builtInRegistryHolder().key());
        tag(ModTags.COPPER_SCYTHE).add(ModItems.COPPER_SCYTHE.builtInRegistryHolder().key());
        tag(ModTags.IRON_SCYTHE).add(ModItems.IRON_SCYTHE.builtInRegistryHolder().key());
        tag(ModTags.GOLDEN_SCYTHE).add(ModItems.GOLDEN_SCYTHE.builtInRegistryHolder().key());
        tag(ModTags.DIAMOND_SCYTHE).add(ModItems.DIAMOND_SCYTHE.builtInRegistryHolder().key());
        tag(ModTags.NETHERITE_SCYTHE).add(ModItems.NETHERITE_SCYTHE.builtInRegistryHolder().key());
    }
}
