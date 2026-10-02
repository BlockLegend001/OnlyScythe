package com.blocklegend001.onlyscythe.datagen;

import com.blocklegend001.onlyscythe.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class ModDataGenerators {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent.Client event) {
        var builder = new RegistrySetBuilder()
                .add(ModRecipeProvider.create());
        event.createReloadableRegistryObjects(builder);
        event.createProvider(ModItemTagsProvider::new);
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModBlockTagsProvider::new);
    }
}
