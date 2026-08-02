package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.item.ModItems;
import com.blocklegend001.onlyscythe.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    private static List<ResourceKey<Item>> keys(Item... items) {
        return Arrays.stream(items)
                .map(item -> item.builtInRegistryHolder().key())
                .collect(Collectors.toList());
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(ItemTags.DURABILITY_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_SCYTHE,
                ModItems.STONE_SCYTHE,
                ModItems.COPPER_SCYTHE,
                ModItems.IRON_SCYTHE,
                ModItems.GOLDEN_SCYTHE,
                ModItems.DIAMOND_SCYTHE,
                ModItems.NETHERITE_SCYTHE));

        builder(ItemTags.MINING_LOOT_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_SCYTHE,
                ModItems.STONE_SCYTHE,
                ModItems.COPPER_SCYTHE,
                ModItems.IRON_SCYTHE,
                ModItems.GOLDEN_SCYTHE,
                ModItems.DIAMOND_SCYTHE,
                ModItems.NETHERITE_SCYTHE));

        builder(ItemTags.VANISHING_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_SCYTHE,
                ModItems.STONE_SCYTHE,
                ModItems.COPPER_SCYTHE,
                ModItems.IRON_SCYTHE,
                ModItems.GOLDEN_SCYTHE,
                ModItems.DIAMOND_SCYTHE,
                ModItems.NETHERITE_SCYTHE));

        builder(ItemTags.MINING_ENCHANTABLE).addAll(keys(
                ModItems.WOODEN_SCYTHE,
                ModItems.STONE_SCYTHE,
                ModItems.COPPER_SCYTHE,
                ModItems.IRON_SCYTHE,
                ModItems.GOLDEN_SCYTHE,
                ModItems.DIAMOND_SCYTHE,
                ModItems.NETHERITE_SCYTHE));

        builder(ItemTags.HOES).addAll(keys(
                ModItems.WOODEN_SCYTHE,
                ModItems.STONE_SCYTHE,
                ModItems.COPPER_SCYTHE,
                ModItems.IRON_SCYTHE,
                ModItems.GOLDEN_SCYTHE,
                ModItems.DIAMOND_SCYTHE,
                ModItems.NETHERITE_SCYTHE));

        builder(ItemTags.BREAKS_DECORATED_POTS).addAll(keys(
                ModItems.WOODEN_SCYTHE,
                ModItems.STONE_SCYTHE,
                ModItems.COPPER_SCYTHE,
                ModItems.IRON_SCYTHE,
                ModItems.GOLDEN_SCYTHE,
                ModItems.DIAMOND_SCYTHE,
                ModItems.NETHERITE_SCYTHE));

        builder(ConventionalItemTags.TOOLS).addAll(keys(
                ModItems.WOODEN_SCYTHE,
                ModItems.STONE_SCYTHE,
                ModItems.COPPER_SCYTHE,
                ModItems.IRON_SCYTHE,
                ModItems.GOLDEN_SCYTHE,
                ModItems.DIAMOND_SCYTHE,
                ModItems.NETHERITE_SCYTHE));

        builder(ModTags.WOODEN_SCYTHE).addAll(keys(ModItems.WOODEN_SCYTHE));
        builder(ModTags.STONE_SCYTHE).addAll(keys(ModItems.STONE_SCYTHE));
        builder(ModTags.COPPER_SCYTHE).addAll(keys(ModItems.COPPER_SCYTHE));
        builder(ModTags.IRON_SCYTHE).addAll(keys(ModItems.IRON_SCYTHE));
        builder(ModTags.GOLDEN_SCYTHE).addAll(keys(ModItems.GOLDEN_SCYTHE));
        builder(ModTags.DIAMOND_SCYTHE).addAll(keys(ModItems.DIAMOND_SCYTHE));
        builder(ModTags.NETHERITE_SCYTHE).addAll(keys(ModItems.NETHERITE_SCYTHE));
    }
}