package com.blocklegend001.onlyscythe.item;

import com.blocklegend001.onlyscythe.Constants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class ModItemGroups {
    public static void registerTab() {
        ResourceKey<CreativeModeTab> tab = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, "tab"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tab, FabricItemGroup.builder()
                .icon(ModItems.NETHERITE_SCYTHE::getDefaultInstance)
                .title(Component.translatable("itemGroup.onlyscythe"))
                .displayItems((context, entries) -> {
                    entries.accept(ModItems.WOODEN_SCYTHE);
                    entries.accept(ModItems.STONE_SCYTHE);
                    entries.accept(ModItems.IRON_SCYTHE);
                    entries.accept(ModItems.GOLDEN_SCYTHE);
                    entries.accept(ModItems.DIAMOND_SCYTHE);
                    entries.accept(ModItems.NETHERITE_SCYTHE);
                })
                .build()
        );
    }
}
