package com.blocklegend001.onlyscythe;

import com.blocklegend001.onlyscythe.config.ScytheConfig;
import com.blocklegend001.onlyscythe.event.ScytheEvent;
import com.blocklegend001.onlyscythe.item.ModItemGroups;
import com.blocklegend001.onlyscythe.item.ModItemRegistry;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class OnlyScythe {

    public OnlyScythe(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModBusGroup();
        ScytheConfig.loadConfig();
        CommonClass.init();
        ModItemRegistry.ITEMS.register(modEventBus);
        ModItemGroups.TABS.register(modEventBus);

        PlayerInteractEvent.LeftClickBlock.BUS.addListener(
                event -> {
                    if (event.getAction() != PlayerInteractEvent.LeftClickBlock.Action.START)
                        return false;

                    InteractionResult result = ScytheEvent.handleAttackBlock(
                            event.getEntity(),
                            event.getLevel(),
                            event.getHand(),
                            event.getPos(),
                            event.getFace()
                    );

                    return result == InteractionResult.SUCCESS;
                }
        );
    }
}
