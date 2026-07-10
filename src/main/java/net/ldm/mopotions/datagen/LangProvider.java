package net.ldm.mopotions.datagen;

import net.ldm.mopotions.MoPotionsMod;
import net.ldm.mopotions.init.MoPotionsEffects;
import net.ldm.mopotions.init.MoPotionsItems;
import net.ldm.mopotions.init.MoPotionsPotions;
import net.minecraft.data.PackOutput;
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
            add("item.minecraft.potion.effect."+translation.ref, String.format("Potion of %s", translation.name));
            add("item.minecraft.splash_potion.effect."+translation.ref, String.format("Splash Potion of %s", translation.name));
            add("item.minecraft.lingering_potion.effect."+translation.ref, String.format("Lingering Potion of %s", translation.name));
            add("item.minecraft.tipped_arrow.effect."+translation.ref, String.format("Arrow of %s", translation.name));
        }

        // Effects
        add(MoPotionsEffects.SATISFACTION.get(), "Satisfaction");

        // Items
        add(MoPotionsItems.FERMENTED_SUGAR.get(), "Fermented Sugar");
    }

    public record Translation<T>(T ref, String name) {}
}
