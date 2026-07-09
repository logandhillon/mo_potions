package net.ldm.mopotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.ldm.mopotions.potion.SatisfactionMobEffect;
import net.ldm.mopotions.MoPotionsMod;

public class MoPotionsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MoPotionsMod.MOD_ID);
	public static final RegistryObject<MobEffect> SATISFACTION = REGISTRY.register("satisfaction", () -> new SatisfactionMobEffect());
}
