package com.minestrapp.minestrappolation.armorsets;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class BlaziumArmorSet extends ArmorSet{

    int rangeXZ = 2;
    int rangeY = 2;

    public BlaziumArmorSet(Item helmet, Item feet, Item legs, Item chest) {
        super(helmet, feet, legs, chest);
    }

    @Override
    public void doSetEffect(Player player, ServerLevel world){
        double chance = world.getRandom().nextDouble();
        for(LivingEntity entity: world.getNearbyEntities(LivingEntity.class, TargetingConditions.forNonCombat(), player, player.getBoundingBox().inflate(rangeXZ,rangeY,rangeXZ))){
            if(chance >= 0.99D) {
                entity.setSecondsOnFire(1);
            }
        }
    }
}
