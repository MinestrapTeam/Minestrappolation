package com.minestrapp.minestrappolation.armorsets;

import com.minestrapp.minestrappolation.init.MItems;

import java.util.ArrayList;
import java.util.HashMap;

public class ArmorSetHolder {

    public static ArrayList<ArmorSet> armorSets = new ArrayList<>();

    static {
        armorSets.add(new MeuroditeArmorSet(MItems.MEURODITE_BOOTS.get(), MItems.MEURODITE_LEGS.get(), MItems.MEURODITE_CHEST.get(), MItems.MEURODITE_HELMET.get()));
        armorSets.add(new BlaziumArmorSet(MItems.BLAZIUM_BOOTS.get(), MItems.BLAZIUM_LEGS.get(), MItems.BLAZIUM_CHEST.get(), MItems.BLAZIUM_HELMET.get()));
    }
}
