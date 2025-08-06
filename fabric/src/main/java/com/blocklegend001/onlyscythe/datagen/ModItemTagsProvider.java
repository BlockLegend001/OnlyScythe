package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.item.ModItems;
import com.blocklegend001.onlyscythe.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        getOrCreateTagBuilder(ModTags.WOODEN_SCYTHE).add(ModItems.WOODEN_SCYTHE);
        getOrCreateTagBuilder(ModTags.STONE_SCYTHE).add(ModItems.STONE_SCYTHE);
        getOrCreateTagBuilder(ModTags.IRON_SCYTHE).add(ModItems.IRON_SCYTHE);
        getOrCreateTagBuilder(ModTags.GOLDEN_SCYTHE).add(ModItems.GOLDEN_SCYTHE);
        getOrCreateTagBuilder(ModTags.DIAMOND_SCYTHE).add(ModItems.DIAMOND_SCYTHE);
        getOrCreateTagBuilder(ModTags.NETHERITE_SCYTHE).add(ModItems.NETHERITE_SCYTHE);
    }
}
