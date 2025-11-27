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

    public OnlyScythe(FMLJavaModLoadingContext context) {
        ScytheConfig.loadConfig();
        IEventBus modEventBus = context.getModEventBus();
        CommonClass.init();
        ModItemGroups.TABS.register(modEventBus);
        ModItemRegistry.ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(Event.class);
    }
}
