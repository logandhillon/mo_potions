package net.ldm.mopotions.init;

import net.ldm.mopotions.MoPotions;
import net.ldm.mopotions.potion.SatisfactionMobEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMobEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(
            Registries.MOB_EFFECT, MoPotions.MOD_ID);

    public static final Holder<MobEffect> SATISFACTION = REGISTRY.register(
            "satisfaction", SatisfactionMobEffect::new);
}
