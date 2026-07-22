package net.ldm.mopotions;

import net.ldm.mopotions.init.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

import javax.annotation.Nullable;

import static net.ldm.mopotions.init.ModPotions.*;

@EventBusSubscriber
public class BrewingRecipes {

    @SubscribeEvent
    public static void onRegisterEvent(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        //Haste
        register(
                builder, Potions.THICK, ModItems.FERMENTED_SUGAR.value(), HASTE_POTION, LONG_HASTE_POTION,
                STRONG_HASTE_POTION);

        //Mining Fatigue
        register(
                builder, HASTE_POTION, Items.FERMENTED_SPIDER_EYE, MINING_FATIGUE_POTION, LONG_MINING_FATIGUE_POTION,
                STRONG_MINING_FATIGUE_POTION);

        //Nausea
        register(builder, Potions.MUNDANE, Items.PUFFERFISH, NAUSEA, LONG_NAUSEA, null);

        //Blindness
        register(builder, Potions.THICK, Items.INK_SAC, BLINDNESS, LONG_BLINDNESS, STRONG_BLINDNESS);

        //Decay
        register(builder, Potions.POISON, Items.WITHER_ROSE, DECAY, LONG_DECAY, STRONG_DECAY);

        //Resistance
        register(
                builder, Potions.FIRE_RESISTANCE, Items.FERMENTED_SPIDER_EYE, RESISTANCE, LONG_RESISTANCE,
                STRONG_RESISTANCE);

        //Glowing
        register(builder, Potions.THICK, Items.GLOWSTONE_DUST, GLOWING, LONG_GLOWING, null);

        //Levitation
        register(
                builder, Potions.SLOW_FALLING, Items.FERMENTED_SPIDER_EYE, LEVITATION, LONG_LEVITATION,
                STRONG_LEVITATION);

        //Satisfaction
        register(builder, Potions.MUNDANE, Items.GOLDEN_CARROT, SATISFACTION_POTION, LONG_SATISFACTION, null);

        //Hunger
        register(builder, Potions.MUNDANE, Items.ROTTEN_FLESH, HUNGER, LONG_HUNGER, STRONG_HUNGER);

        //Absorption
        register(builder, Potions.HEALING, Items.GOLDEN_CARROT, ABSORPTION, LONG_ABSORPTION, STRONG_ABSORPTION);

        //Luck
        register(builder, Potions.LEAPING, Items.GLISTERING_MELON_SLICE, LUCK, LONG_LUCK, null);

        //Bad Luck (minecraft:unluck)
        register(builder, LUCK, Items.FERMENTED_SPIDER_EYE, BAD_LUCK, LONG_BAD_LUCK, null);

        //Conduit Power
        register(builder, Potions.WATER_BREATHING, Items.HEART_OF_THE_SEA, CONDUIT_POWER, LONG_CONDUIT_POWER, null);
    }

    private static void register(
            PotionBrewing.Builder builder, Holder<Potion> base, Item ingredient, Holder<Potion> resultDefault,
            @Nullable Holder<Potion> resultLong, @Nullable Holder<Potion> resultStrong
    ) {
        builder.addMix(base, ingredient, resultDefault);
        if (resultLong != null) builder.addMix(resultDefault, Items.REDSTONE, resultLong);
        if (resultStrong != null) builder.addMix(resultDefault, Items.GLOWSTONE_DUST, resultStrong);
    }
}
