package net.ldm.mopotions.init;

import net.ldm.mopotions.MoPotions;
import net.ldm.mopotions.datagen.LangProvider;
import net.ldm.mopotions.datagen.LangProvider.Translation;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ModPotions {
    public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(
            Registries.POTION, MoPotions.MOD_ID);

    /**
     * Stores translations against the Item ID
     */
    public static final ArrayList<LangProvider.Translation<String>> TRANSLATIONS = new ArrayList<>();

    public static final Holder<Potion> HASTE_POTION        = register(
            "haste_potion", "Haste",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
    public static final Holder<Potion> STRONG_HASTE_POTION = register(
            "strong_haste_potion", "Haste",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1, false, true)));
    public static final Holder<Potion> LONG_HASTE_POTION   = register(
            "long_haste_potion", "Haste",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 9600, 0, false, true)));

    public static final Holder<Potion> MINING_FATIGUE_POTION        = register(
            "mining_fatigue_potion", "Mining Fatigue",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1800, 0, false, true)));
    public static final Holder<Potion> STRONG_MINING_FATIGUE_POTION = register(
            "strong_mining_fatigue_potion", "Mining Fatigue",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 900, 1, false, true)));
    public static final Holder<Potion> LONG_MINING_FATIGUE_POTION   = register(
            "long_mining_fatigue_potion", "Mining Fatigue",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 4800, 0, false, true)));

    public static final Holder<Potion> NAUSEA      = register(
            "nausea", "Nausea",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 1800, 0, false, true)));
    public static final Holder<Potion> LONG_NAUSEA = register(
            "long_nausea", "Nausea",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 4800, 0, false, true)));

    public static final Holder<Potion> BLINDNESS        = register(
            "blindness", "Blindness",
            () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 1800, 0, false, true)));
    public static final Holder<Potion> STRONG_BLINDNESS = register(
            "strong_blindness", "Blindness",
            () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 500, 2, false, true)));
    public static final Holder<Potion> LONG_BLINDNESS   = register(
            "long_blindness", "Blindness",
            () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 4800, 0, false, true)));

    public static final Holder<Potion> DECAY        = register(
            "decay", "Decay",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 1800, 0, false, true)));
    public static final Holder<Potion> STRONG_DECAY = register(
            "strong_decay", "Decay",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 900, 1, false, true)));
    public static final Holder<Potion> LONG_DECAY   = register(
            "long_decay", "Decay",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 4800, 0, false, true)));

    public static final Holder<Potion> RESISTANCE        = register(
            "resistance", "Resistance",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, false, true)));
    public static final Holder<Potion> LONG_RESISTANCE   = register(
            "long_resistance", "Resistance",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9600, 0, false, true)));
    public static final Holder<Potion> STRONG_RESISTANCE = register(
            "strong_resistance", "Resistance",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1, false, true)));

    public static final Holder<Potion> GLOWING      = register(
            "glowing", "Glowing",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 3600, 0, false, true)));
    public static final Holder<Potion> LONG_GLOWING = register(
            "long_glowing", "Glowing",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 9600, 0, false, true)));

    public static final Holder<Potion> LEVITATION        = register(
            "levitation", "Levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 600, 0, false, true)));
    public static final Holder<Potion> STRONG_LEVITATION = register(
            "strong_levitation", "Levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 400, 1, false, true)));
    public static final Holder<Potion> LONG_LEVITATION   = register(
            "long_levitation", "Levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 900, 0, false, true)));

    public static final Holder<Potion> SATISFACTION_POTION = register(
            "satisfaction_potion", "Satisfaction",
            () -> new Potion(new MobEffectInstance(ModMobEffects.SATISFACTION, 600, 0, false, true)));
    public static final Holder<Potion> LONG_SATISFACTION   = register(
            "long_satisfaction", "Satisfaction",
            () -> new Potion(new MobEffectInstance(ModMobEffects.SATISFACTION, 1000, 0, false, true)));

    public static final Holder<Potion> HUNGER        = register(
            "hunger", "Hunger",
            () -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 1800, 0, false, true)));
    public static final Holder<Potion> LONG_HUNGER   = register(
            "long_hunger", "Hunger",
            () -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 4800, 0, false, true)));
    public static final Holder<Potion> STRONG_HUNGER = register(
            "strong_hunger", "Hunger",
            () -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 900, 1, false, true)));

    public static final Holder<Potion> ABSORPTION        = register(
            "absorption", "Absorption",
            () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0, false, true)));
    public static final Holder<Potion> LONG_ABSORPTION   = register(
            "long_absorption", "Absorption",
            () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 9600, 0, false, true)));
    public static final Holder<Potion> STRONG_ABSORPTION = register(
            "strong_absorption", "Absorption",
            () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 1800, 1, false, true)));

    public static final Holder<Potion> LUCK      = register(
            "luck", "Luck",
            () -> new Potion(new MobEffectInstance(MobEffects.LUCK, 6000, 0, false, true)));
    public static final Holder<Potion> LONG_LUCK = register(
            "long_luck", "Luck",
            () -> new Potion(new MobEffectInstance(MobEffects.LUCK, 9000, 0, false, true)));

    public static final Holder<Potion> BAD_LUCK      = register(
            "bad_luck", "Bad Luck",
            () -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 3000, 0, false, true)));
    public static final Holder<Potion> LONG_BAD_LUCK = register(
            "long_bad_luck", "Bad Luck",
            () -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 4500, 0, false, true)));

    public static final Holder<Potion> CONDUIT_POWER      = register(
            "conduit_power", "Conduit Power",
            () -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 9600, 0, false, true)));
    public static final Holder<Potion> LONG_CONDUIT_POWER = register(
            "long_conduit_power", "Conduit Power",
            () -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 14400, 0, false, true)));

    private static Holder<Potion> register(String id, String effectName, Supplier<Potion> potion) {
        TRANSLATIONS.add(new Translation<>(id, effectName));
        return REGISTRY.register(id, potion);
    }
}
