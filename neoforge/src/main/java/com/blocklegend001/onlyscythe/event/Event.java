package com.blocklegend001.onlyscythe.event;

import net.minecraft.world.InteractionResult;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

import static com.blocklegend001.onlyscythe.event.ScytheEvent.handleAttackBlock;

public class Event {

    @SubscribeEvent
    public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
        InteractionResult result = handleAttackBlock(
                event.getEntity(),
                event.getLevel(),
                event.getHand(),
                event.getPos(),
                event.getFace()
        );

        if (result == InteractionResult.SUCCESS) {
            event.setCanceled(true);
        }
    }
}
