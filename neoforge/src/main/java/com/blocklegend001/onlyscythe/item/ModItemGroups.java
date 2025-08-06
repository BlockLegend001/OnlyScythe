package com.blocklegend001.onlyscythe.item;

import com.blocklegend001.onlyscythe.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class ModItemGroups {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.onlyscythe"))
            .icon(ModItems.NETHERITE_SCYTHE::getDefaultInstance)
            .build());

    @SubscribeEvent
    public static void onRegisterCreativeModeTabEvent(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() != ModItemGroups.TAB.get())
            return;
        ModItemRegistry.ITEMS.getEntries().stream().map(DeferredHolder::get).forEach(event::accept);
    }
}