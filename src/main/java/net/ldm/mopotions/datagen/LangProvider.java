package net.ldm.mopotions.datagen;

import net.ldm.mopotions.MoPotionsMod;
import net.ldm.mopotions.init.MoPotionsEffects;
import net.ldm.mopotions.init.MoPotionsItems;
import net.ldm.mopotions.init.MoPotionsPotions;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraftforge.common.data.LanguageProvider;

/**
 * @author Logan Dhillon
 */
public class LangProvider extends LanguageProvider {
    public LangProvider(PackOutput pack) {
        super(pack, MoPotionsMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Potions
        for (Translation<String> translation: MoPotionsPotions.TRANSLATIONS) {
            add("item.minecraft.potion.effect."+translation.ref, "Potion of " + translation.name);
            add("item.minecraft.splash_potion.effect."+translation.ref, "Splash Potion of " + translation.name);
            add("item.minecraft.lingering_potion.effect."+translation.ref, "Lingering Potion of " + translation.name);
            add("item.minecraft.tipped_arrow.effect."+translation.ref, "Arrow of " + translation.name);
        }

        // Effects
        add(MoPotionsEffects.SATISFACTION.get(), "Satisfaction");

        // Items
        add(MoPotionsItems.FERMENTED_SUGAR.get(), "Fermented Sugar");

        // Advancements
        addAdvancement("iron_belly", "Iron Belly", "Save yourself from starvation using rotten flesh");
    }

    private void addAdvancement(String key, String title, String description) {
        add("advancement.mo_potions." + key + ".title", title);
        add("advancement.mo_potions." + key + ".description", description);
    }

    public record Translation<T>(T ref, String name) {}
}
