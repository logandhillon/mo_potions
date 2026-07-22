
package net.ldm.mopotions.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class SatisfactionMobEffect extends MobEffect {
    public SatisfactionMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -5287392);
    }

    @Override
    public String getDescriptionId() {
        return "effect.mo_potions.satisfaction";
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (!(entity instanceof Player player)) return false;

        if (player.getFoodData().getSaturationLevel() < 20)
            player.getFoodData().setSaturation(player.getFoodData().getSaturationLevel() + 1);

        if (player.getFoodData().getFoodLevel() < 20)
            player.getFoodData().setFoodLevel(player.getFoodData().getFoodLevel() + 1);

        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplifier) {
        return tickCount % 5 == 0;
    }
}
