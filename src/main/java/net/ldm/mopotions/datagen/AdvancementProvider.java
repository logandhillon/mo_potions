package net.ldm.mopotions.datagen;

import net.ldm.mopotions.MoPotionsMod;
import net.ldm.mopotions.criteria.trigger.StarvingRottenFleshTrigger;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 * @author Logan Dhillon
 */
public class AdvancementProvider extends ForgeAdvancementProvider {
    public AdvancementProvider(PackOutput output, CompletableFuture<Provider> registries,
                               ExistingFileHelper existingFileHelper) {
        super(output, registries, existingFileHelper, List.of(new SubGenerator()));
    }

    public static class SubGenerator implements AdvancementGenerator {
        @Override
        public void generate(Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            Advancement.Builder.advancement()
                               .parent(ResourceLocation.withDefaultNamespace("adventure/kill_a_mob"))
                               .display(
                                       Items.ROTTEN_FLESH,
                                       Component.translatable("advancement.mo_potions.iron_belly.title"),
                                       Component.translatable("advancement.mo_potions.iron_belly.description"),
                                       null,
                                       FrameType.TASK,
                                       true,
                                       true,
                                       false)
                               .addCriterion(
                                       "ate_rotten_flesh_while_starving",
                                       StarvingRottenFleshTrigger.TriggerInstance.instance())
                               .save(
                                       saver,
                                       ResourceLocation.fromNamespaceAndPath(
                                               MoPotionsMod.MOD_ID, "adventure/iron_belly"), existingFileHelper);
        }
    }
}
