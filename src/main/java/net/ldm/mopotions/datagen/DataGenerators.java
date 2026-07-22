package net.ldm.mopotions.datagen;

import net.ldm.mopotions.MoPotions;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author Logan Dhillon
 */
@Mod.EventBusSubscriber(modid = MoPotions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput pack = gen.getPackOutput();

        gen.addProvider(event.includeClient(), new LangProvider(pack));
        gen.addProvider(event.includeClient(), new ModItemModelProvider(pack, event.getExistingFileHelper()));

        gen.addProvider(
                event.includeServer(),
                new AdvancementProvider(pack, event.getLookupProvider(), event.getExistingFileHelper()));
    }
}
