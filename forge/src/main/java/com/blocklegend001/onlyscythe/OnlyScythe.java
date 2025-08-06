package com.blocklegend001.onlyscythe;

import com.blocklegend001.onlyscythe.config.ScytheConfig;
import com.blocklegend001.onlyscythe.event.Event;
import com.blocklegend001.onlyscythe.item.ModItemGroups;
import com.blocklegend001.onlyscythe.item.ModItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class OnlyScythe {

    public OnlyScythe() {
        ScytheConfig.loadConfig();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CommonClass.init();
        ModItemRegistry.ITEMS.register(modEventBus);
        ModItemGroups.TABS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(Event.class);
    }
}
