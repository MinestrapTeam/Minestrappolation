package com.minestrapp.minestrappolation.armorsets;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ArmorSet {


    public List<Item> armorSet = new ArrayList<>();

    public ArmorSet(Item helmet, Item feet, Item legs, Item chest){
        armorSet.add(helmet);
        armorSet.add(feet);
        armorSet.add(legs);
        armorSet.add(chest);
    }

    public List<Item> getArmorSet(){
        return armorSet;
    }

    public void doSetEffect(Player player, ServerLevel world){

    }
}
