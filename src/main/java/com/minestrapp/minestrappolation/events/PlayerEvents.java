package com.minestrapp.minestrappolation.events;

import com.minestrapp.minestrappolation.init.MItems;
import com.minestrapp.minestrappolation.util.PlayerUtil;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerEvents {

    @SubscribeEvent
    public static void playerTickEvent(TickEvent.PlayerTickEvent event){
        if(PlayerUtil.isWearingSet(event.player, MItems.MEURODITE_BOOTS.get(), MItems.MEURODITE_LEGS.get(), MItems.MEURODITE_CHEST.get(), MItems.MEURODITE_HELMET.get())){

        }
    }
}
