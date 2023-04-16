package com.minestrapp.minestrappolation.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class PlayerUtil {

    public static boolean isWearingSet(Player player, List<Item> armorSet){
        for(ItemStack itemStack: player.getArmorSlots()){
            Item wornItem = itemStack.getItem();
            if(!armorSet.contains(wornItem)){
                return false;
            }
        }

        return true;
    }
}
