package net.ldm.mopotions.datagen;

import net.ldm.mopotions.MoPotionsMod;
import net.ldm.mopotions.init.MoPotionsItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * @author Logan Dhillon
 */
public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoPotionsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(MoPotionsItems.FERMENTED_SUGAR.get());
    }
}
