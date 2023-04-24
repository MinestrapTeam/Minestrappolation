package com.minestrapp.minestrappolation.items;

import com.minestrapp.minestrappolation.interfaces.IShiftableTooltip;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ItemBaseWithTip extends ItemBase implements IShiftableTooltip {

    private String tip;

    public ItemBaseWithTip(Properties properties, String tooltip) {
        super(properties);
        tip = tooltip;
    }

    @Override
    public String getShiftInfo(ItemStack stack) {
        return this.tip;
    }
}
