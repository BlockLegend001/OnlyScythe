package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.Constants;
import com.blocklegend001.onlyscythe.item.ModItems;
import com.blocklegend001.onlyscythe.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> tagLookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, tagLookupCompletableFuture, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.HOES).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        tag(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        tag(Tags.Items.TOOLS).add(ModItems.WOODEN_SCYTHE)
                .add(ModItems.STONE_SCYTHE)
                .add(ModItems.IRON_SCYTHE)
                .add(ModItems.GOLDEN_SCYTHE)
                .add(ModItems.DIAMOND_SCYTHE)
                .add(ModItems.NETHERITE_SCYTHE);

        tag(ModTags.WOODEN_SCYTHE).add(ModItems.WOODEN_SCYTHE);
        tag(ModTags.STONE_SCYTHE).add(ModItems.STONE_SCYTHE);
        tag(ModTags.IRON_SCYTHE).add(ModItems.IRON_SCYTHE);
        tag(ModTags.GOLDEN_SCYTHE).add(ModItems.GOLDEN_SCYTHE);
        tag(ModTags.DIAMOND_SCYTHE).add(ModItems.DIAMOND_SCYTHE);
        tag(ModTags.NETHERITE_SCYTHE).add(ModItems.NETHERITE_SCYTHE);
    }
}
