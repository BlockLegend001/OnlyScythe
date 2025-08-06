package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.Constants;
import com.blocklegend001.onlyscythe.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

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

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID,"item/" + item.getId().getPath()));
    }
}
