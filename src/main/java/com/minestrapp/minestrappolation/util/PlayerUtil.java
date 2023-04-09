package com.minestrapp.minestrappolation.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class PlayerUtil {

    public static boolean isWearingSet(Player player, Item helmet, Item feet, Item legs, Item chest){
        List<Item> armorSet = new ArrayList<>();
        armorSet.add(helmet);
        armorSet.add(feet);
        armorSet.add(legs);
        armorSet.add(chest);

        for(ItemStack itemStack: player.getArmorSlots()){
            Item wornItem = itemStack.getItem();
            if(!armorSet.contains(wornItem)){
                return false;
            }
        }

        return true;
    }
}
