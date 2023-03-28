package com.minestrapp.minestrappolation.items;

import com.minestrapp.minestrappolation.interfaces.IShiftableTooltip;

public class ItemBaseWithTip extends ItemBase implements IShiftableTooltip {

    private String tip;

    public ItemBaseWithTip(Properties properties, String tooltip) {
        super(properties);
        tip = tooltip;
    }

    @Override
    public String getShiftInfo() {
        return this.tip;
    }
}
