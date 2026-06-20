package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output, String modId) {
        super(output, modId);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModel(itemModels, ModItems.WOODEN_SCYTHE);
        itemModel(itemModels, ModItems.STONE_SCYTHE);
        itemModel(itemModels, ModItems.COPPER_SCYTHE);
        itemModel(itemModels, ModItems.GOLDEN_SCYTHE);
        itemModel(itemModels, ModItems.IRON_SCYTHE);
        itemModel(itemModels, ModItems.DIAMOND_SCYTHE);
        itemModel(itemModels, ModItems.NETHERITE_SCYTHE);
    }

    public void itemModel(ItemModelGenerators itemModels, Item item)
    {
        itemModels.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}