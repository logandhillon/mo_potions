package net.ldm.mopotions;

import net.ldm.mopotions.init.MoPotionsItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nullable;

import static net.ldm.mopotions.init.MoPotionsPotions.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrewingRecipes {

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        //Haste
        register(Potions.THICK, MoPotionsItems.FERMENTED_SUGAR.get(), HASTE_POTION.get(), LONG_HASTE_POTION.get(), STRONG_HASTE_POTION.get());

        //Mining Fatigue
        register(HASTE_POTION.get(), Items.FERMENTED_SPIDER_EYE, MINING_FATIGUE_POTION.get(), LONG_MINING_FATIGUE_POTION.get(), STRONG_MINING_FATIGUE_POTION.get());

        //Nausea
        register(Potions.MUNDANE, Items.PUFFERFISH, NAUSEA.get(), LONG_NAUSEA.get(), null);

        //Blindness
        register(Potions.THICK, Items.INK_SAC, BLINDNESS.get(), LONG_BLINDNESS.get(), STRONG_BLINDNESS.get());

        //Decay
        register(Potions.POISON, Items.WITHER_ROSE, DECAY.get(), LONG_DECAY.get(), STRONG_DECAY.get());

        //Resistance
        register(Potions.FIRE_RESISTANCE, Items.FERMENTED_SPIDER_EYE, RESISTANCE.get(), LONG_RESISTANCE.get(), STRONG_RESISTANCE.get());

        //Glowing
        register(Potions.THICK, Items.GLOWSTONE_DUST, GLOWING.get(), LONG_GLOWING.get(), null);

        //Levitation
        register(Potions.SLOW_FALLING, Items.FERMENTED_SPIDER_EYE, LEVITATION.get(), LONG_LEVITATION.get(), STRONG_LEVITATION.get());

        //Satisfaction
        register(Potions.MUNDANE, Items.GOLDEN_CARROT, SATISFACTION_POTION.get(), LONG_SATISFACTION.get(), null);

        //Hunger
        register(Potions.MUNDANE, Items.ROTTEN_FLESH, HUNGER.get(), LONG_HUNGER.get(), STRONG_HUNGER.get());

        //Absorption
        register(Potions.HEALING, Items.GOLDEN_CARROT, ABSORPTION.get(), LONG_ABSORPTION.get(), STRONG_ABSORPTION.get());

        //Luck
        register(Potions.LEAPING, Items.GLISTERING_MELON_SLICE, LUCK.get(), LONG_LUCK.get(), null);

        //Bad Luck (minecraft:unluck)
        register(LUCK.get(), Items.FERMENTED_SPIDER_EYE, BAD_LUCK.get(), LONG_BAD_LUCK.get(), null);

        //Conduit Power
        register(Potions.WATER_BREATHING, Items.HEART_OF_THE_SEA, CONDUIT_POWER.get(), LONG_CONDUIT_POWER.get(), null);
    }

    private static void register(Potion base, Item ingredient, Potion resultDefault, @Nullable Potion resultLong,
                                 @Nullable Potion resultStrong) {
        PotionBrewing.addMix(base, ingredient, resultDefault);
        if (resultLong != null) PotionBrewing.addMix(resultDefault, Items.REDSTONE, resultLong);
        if (resultStrong != null) PotionBrewing.addMix(resultDefault, Items.GLOWSTONE_DUST, resultStrong);
    }
}
