package com.minestrapp.minestrappolation.armorsets;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.phys.AABB;

public class MeuroditeArmorSet extends ArmorSet{

    int rangeXZ = 10;
    int rangeY = 5;

    public MeuroditeArmorSet(Item helmet, Item feet, Item legs, Item chest) {
        super(helmet, feet, legs, chest);
    }

    @Override
    public void doSetEffect(Player player, ServerLevel world){
        for(LivingEntity entity: world.getNearbyEntities(LivingEntity.class, TargetingConditions.forNonCombat(), player, player.getBoundingBox().inflate(rangeXZ,rangeY,rangeXZ))){
            entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 5));
        }
    }
}
