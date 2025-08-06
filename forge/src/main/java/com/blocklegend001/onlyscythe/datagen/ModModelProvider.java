package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.Constants;
import com.blocklegend001.onlyscythe.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModModelProvider extends ItemModelProvider {
    public ModModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.WOODEN_SCYTHE);
        handheldItem(ModItems.STONE_SCYTHE);
        handheldItem(ModItems.GOLDEN_SCYTHE);
        handheldItem(ModItems.IRON_SCYTHE);
        handheldItem(ModItems.DIAMOND_SCYTHE);
        handheldItem(ModItems.NETHERITE_SCYTHE);
    }

    private void handheldItem(Item item) {
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);
        String name = id.getPath();
        singleTexture(name, mcLoc("item/handheld"), "layer0", modLoc("item/" + name));
    }
}
