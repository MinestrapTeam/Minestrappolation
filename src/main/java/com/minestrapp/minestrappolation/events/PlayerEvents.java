package com.minestrapp.minestrappolation.events;

import com.minestrapp.minestrappolation.init.Items;
import com.minestrapp.minestrappolation.util.PlayerUtil;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PlayerEvents {

    @SubscribeEvent
    public static void playerTickEvent(TickEvent.PlayerTickEvent event){
        if(PlayerUtil.isWearingSet(event.player, Items.MEURODITE_BOOTS.get(), Items.MEURODITE_LEGS.get(), Items.MEURODITE_CHEST.get(), Items.MEURODITE_HELMET.get())){

        }
    }
}
