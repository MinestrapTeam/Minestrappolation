package com.minestrapp.minestrappolation.datagen;

import com.minestrapp.minestrappolation.init.MBlocks;
import com.minestrapp.minestrappolation.init.MItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class LangGen extends LanguageProvider {

    public LangGen(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.Minestrappolation","Minestrappolation");
        for(RegistryObject<Block> block: MBlocks.BLOCKS.getEntries()){
            add(block.get(), createName(block));
        }
        for(RegistryObject<Item> item: MItems.ITEMS.getEntries()){
            add(item.get(),createName(item));
        }
    }

    private String createName(RegistryObject object){
        StringBuilder sb = new StringBuilder();
        String unlocalized = object.getId().toString();
        String[] temp = unlocalized.split(":");
        String[] temp1 = temp[1].split("_");
        for (int i = 0; i < temp1.length; i++){
            String cap = temp1[i].substring(0,1).toUpperCase();
            sb.append(cap);
            sb.append(temp1[i].substring(1)+ " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
