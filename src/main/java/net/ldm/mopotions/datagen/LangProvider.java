package net.ldm.mopotions.datagen;

import net.ldm.mopotions.MoPotionsMod;
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

    }
}
