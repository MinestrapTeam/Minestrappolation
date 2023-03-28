package com.minestrapp.minestrappolation.events;

import com.minestrapp.minestrappolation.Minestrappolation;
import com.minestrapp.minestrappolation.init.Keys;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Minestrappolation.ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientForgeEvent {

    @SubscribeEvent
    public static void onKeyRegistry(RegisterKeyMappingsEvent event){
        event.register(Keys.TOOLTIP_KEY);
    }
}
