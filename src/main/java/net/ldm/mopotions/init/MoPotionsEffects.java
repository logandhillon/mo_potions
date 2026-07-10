package net.ldm.mopotions.init;

import net.ldm.mopotions.MoPotionsMod;
import net.ldm.mopotions.potion.SatisfactionMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MoPotionsEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(
            ForgeRegistries.MOB_EFFECTS, MoPotionsMod.MOD_ID);

    public static final RegistryObject<MobEffect> SATISFACTION = REGISTRY.register(
            "satisfaction", SatisfactionMobEffect::new);
}
