
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
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (!(entity instanceof Player player)) return;

        if (player.getFoodData().getSaturationLevel() < 20)
            player.getFoodData().setSaturation(player.getFoodData().getSaturationLevel() + 1);

        if (player.getFoodData().getFoodLevel() < 20)
            player.getFoodData().setFoodLevel(player.getFoodData().getFoodLevel() + 1);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
