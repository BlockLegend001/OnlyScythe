package com.blocklegend001.onlyscythe;

import com.blocklegend001.onlyscythe.config.ScytheConfig;
import com.blocklegend001.onlyscythe.event.ScytheEvent;
import com.blocklegend001.onlyscythe.item.ModItemGroups;
import com.blocklegend001.onlyscythe.item.ModItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;

public class OnlyScythe implements ModInitializer {

    @Override
    public void onInitialize() {
        ScytheConfig.loadConfig();
        loadEvents();
        ModItemRegistry.registerItems();
        ModItemGroups.registerTab();
        CommonClass.init();
    }

    public void loadEvents() {
        AttackBlockCallback.EVENT.register(ScytheEvent::handleAttackBlock);
    }
}
