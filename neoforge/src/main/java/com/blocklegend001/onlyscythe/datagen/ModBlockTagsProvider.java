package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.Constants;
import com.blocklegend001.onlyscythe.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.SCYTHE_BLOCKS)
                .addTag(BlockTags.FLOWERS)
                .add(Blocks.SHORT_GRASS.builtInRegistryHolder().key())
                .add(Blocks.TALL_GRASS.builtInRegistryHolder().key())
                .add(Blocks.FERN.builtInRegistryHolder().key())
                .add(Blocks.LARGE_FERN.builtInRegistryHolder().key())
                .add(Blocks.DEAD_BUSH.builtInRegistryHolder().key())
                .add(Blocks.CRIMSON_ROOTS.builtInRegistryHolder().key())
                .add(Blocks.WARPED_ROOTS.builtInRegistryHolder().key())
                .add(Blocks.NETHER_SPROUTS.builtInRegistryHolder().key())
                .add(Blocks.SWEET_BERRY_BUSH.builtInRegistryHolder().key());
    }
}