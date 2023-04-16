package com.minestrapp.minestrappolation.armorsets;

import com.minestrapp.minestrappolation.init.MItems;

import java.util.HashMap;

public class ArmorSetHolder {

    public static HashMap<String, ArmorSet> armorSets = new HashMap<>();

    static {
        armorSets.put("meurodite", new MeuroditeArmorSet(MItems.MEURODITE_BOOTS.get(), MItems.MEURODITE_LEGS.get(), MItems.MEURODITE_CHEST.get(), MItems.MEURODITE_HELMET.get()));
    }
}
