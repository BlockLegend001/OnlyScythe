package com.blocklegend001.onlyscythe;

import com.blocklegend001.onlyscythe.config.ScytheConfig;
import com.blocklegend001.onlyscythe.event.Event;
import com.blocklegend001.onlyscythe.item.ModItemGroups;
import com.blocklegend001.onlyscythe.item.ModItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(Constants.MOD_ID)
public class OnlyScythe {

    public OnlyScythe(IEventBus eventBus) {
        ScytheConfig.loadConfig();
        CommonClass.init();
        ModItemRegistry.ITEMS.register(eventBus);
        ModItemGroups.TABS.register(eventBus);
        NeoForge.EVENT_BUS.register(Event.class);
    }
}
