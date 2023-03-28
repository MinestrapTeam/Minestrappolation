package com.minestrapp.minestrappolation.events;

import com.minestrapp.minestrappolation.init.Keys;
import com.minestrapp.minestrappolation.interfaces.IShiftableTooltip;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ClientEvent {

    @SubscribeEvent
    public static void toolTip(ItemTooltipEvent event){
        if(event.getItemStack().getItem() instanceof IShiftableTooltip tooltipMessage){
            if(!InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), Keys.TOOLTIP_KEY.getKey().getValue())){
                event.getToolTip().add(Component.literal("Press " + Keys.TOOLTIP_KEY.getKey().getDisplayName().getString() + " for more info").withStyle(ChatFormatting.YELLOW));
            } else {
                event.getToolTip().add(Component.literal(tooltipMessage.getShiftInfo()).withStyle(ChatFormatting.LIGHT_PURPLE));
            }
        }
    }


}
