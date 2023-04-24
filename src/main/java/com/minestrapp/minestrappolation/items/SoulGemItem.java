package com.minestrapp.minestrappolation.items;

import com.minestrapp.minestrappolation.interfaces.IShiftableTooltip;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class SoulGemItem extends Item implements IShiftableTooltip {

    private static int maxLevels = 5;

    public SoulGemItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        CompoundTag nbtData = context.getItemInHand().getOrCreateTag();

        int storedLevels = nbtData.getInt("level");
        int lifetimeLevels = nbtData.getInt("lifetimeLevel");

        Player player = context.getPlayer();

        if(!player.isCrouching()){
            if(storedLevels < maxLevels){
                if(player.experienceLevel >= 1 && lifetimeLevels < maxLevels){
                    nbtData.putInt("level", storedLevels + 1);
                    nbtData.putInt("lifetimeLevel", lifetimeLevels + 1);
                    player.giveExperienceLevels(-1);
                }
            }
        } else {
            if(storedLevels > 0){
                player.giveExperienceLevels(1);
                nbtData.putInt("level", storedLevels - 1);
            }
        }

        if(storedLevels == 0 && lifetimeLevels == maxLevels){
            context.getItemInHand().hurtAndBreak(1, player, (p_41300_) -> {
                p_41300_.broadcastBreakEvent(context.getHand());
            });
        }

        context.getItemInHand().setTag(nbtData);
        return InteractionResult.SUCCESS;
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        CompoundTag nbtData = itemStack.getOrCreateTag();
        if(nbtData.getInt("level") >= 1){
            return true;
        }
        return itemStack.isEnchanted();
    }

    @Override
    public String getShiftInfo(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        int levelsContained = tag.getInt("level");
        int life = tag.getInt("lifetimeLevel");

        return "Stored: " + levelsContained + " Lifetime: " + life + " Max: " + maxLevels;
    }

    public static void setMaxLevel(int level){
        maxLevels = level;
    }
}
