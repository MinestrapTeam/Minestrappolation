package com.minestrapp.minestrappolation.events;

import com.minestrapp.minestrappolation.armorsets.ArmorSet;
import com.minestrapp.minestrappolation.armorsets.ArmorSetHolder;
import com.minestrapp.minestrappolation.init.MItems;
import com.minestrapp.minestrappolation.util.PlayerUtil;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import org.spongepowered.asm.mixin.MixinEnvironment;

@Mod.EventBusSubscriber
public class PlayerEvents {

    @SubscribeEvent
    public static void playerTickEvent(TickEvent.PlayerTickEvent event){
        for(ArmorSet armorSet: ArmorSetHolder.armorSets){
            if(PlayerUtil.isWearingSet(event.player, armorSet.getArmorSet())){
                if(event.side == LogicalSide.SERVER){
                    armorSet.doSetEffect(event.player, event.player.getServer().overworld());
                }
                break;
            }
        }
    }
}
