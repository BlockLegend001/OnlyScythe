package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.item.ModItems;
import com.blocklegend001.onlyscythe.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.COPPER_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        valueLookupBuilder(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.COPPER_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        valueLookupBuilder(ItemTags.VANISHING_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.COPPER_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        valueLookupBuilder(ItemTags.MINING_ENCHANTABLE).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.COPPER_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        valueLookupBuilder(ItemTags.HOES).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.COPPER_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        valueLookupBuilder(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.COPPER_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        valueLookupBuilder(ConventionalItemTags.TOOLS).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.COPPER_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        valueLookupBuilder(ModTags.WOODEN_SCYTHE).add(ModItems.WOODEN_SCYTHE);
        valueLookupBuilder(ModTags.STONE_SCYTHE).add(ModItems.STONE_SCYTHE);
        valueLookupBuilder(ModTags.COPPER_SCYTHE).add(ModItems.COPPER_SCYTHE);
        valueLookupBuilder(ModTags.IRON_SCYTHE).add(ModItems.IRON_SCYTHE);
        valueLookupBuilder(ModTags.GOLDEN_SCYTHE).add(ModItems.GOLDEN_SCYTHE);
        valueLookupBuilder(ModTags.DIAMOND_SCYTHE).add(ModItems.DIAMOND_SCYTHE);
        valueLookupBuilder(ModTags.NETHERITE_SCYTHE).add(ModItems.NETHERITE_SCYTHE);
    }
}
