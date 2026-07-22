package net.ldm.mopotions.datagen;

import net.ldm.mopotions.MoPotions;
import net.ldm.mopotions.criteria.trigger.StarvingRottenFleshTrigger;
import net.ldm.mopotions.init.ModCriteria;
import net.ldm.mopotions.init.ModMobEffects;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.EffectsChangedTrigger;
import net.minecraft.advancements.critereon.MobEffectsPredicate;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.advancements.AdvancementSubProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * @author Logan Dhillon
 */
public class AdvancementProvider extends net.neoforged.neoforge.common.data.AdvancementProvider {
    public AdvancementProvider(PackOutput output, CompletableFuture<Provider> registries,
                               ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new Generator()));
    }

    public static class Generator implements AdvancementGenerator {
        @Override
        public void generate(Provider registries, Consumer<AdvancementHolder> saver,
                             ExistingFileHelper existingFileHelper) {
            Advancement.Builder.advancement()
                               .parent(AdvancementSubProvider.createPlaceholder("adventure/kill_a_mob"))
                               .display(
                                       Items.ROTTEN_FLESH,
                                       Component.translatable("advancement.mo_potions.iron_belly.title"),
                                       Component.translatable("advancement.mo_potions.iron_belly.description"),
                                       null,
                                       AdvancementType.TASK,
                                       true,
                                       true,
                                       false)
                               .addCriterion(
                                       "ate_rotten_flesh_while_starving",
                                       new Criterion<>(
                                               ModCriteria.STARVING_ROTTEN_FLESH.get(),
                                               StarvingRottenFleshTrigger.TriggerInstance.instance()
                                       ))
                               .save(
                                       saver,
                                       ResourceLocation.fromNamespaceAndPath(
                                               MoPotions.MOD_ID, "adventure/iron_belly"), existingFileHelper);

            Advancement.Builder.advancement()
                               .parent(AdvancementSubProvider.createPlaceholder("nether/brew_potion"))
                               .display(
                                       Items.GOLDEN_CARROT,
                                       Component.translatable("advancement.mo_potions.drink_satisfaction.title"),
                                       Component.translatable("advancement.mo_potions.drink_satisfaction.description"),
                                       null,
                                       AdvancementType.TASK,
                                       true,
                                       true,
                                       false)
                               .addCriterion(
                                       "drink_satisfaction_potion",
                                       EffectsChangedTrigger.TriggerInstance.hasEffects(
                                               MobEffectsPredicate.Builder.effects().and(ModMobEffects.SATISFACTION))
                               )
                               .save(
                                       saver,
                                       ResourceLocation.fromNamespaceAndPath(
                                               MoPotions.MOD_ID, "nether/drink_satisfaction"), existingFileHelper);
        }
    }
}
