package net.ldm.mopotions.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

/**
 * @author Logan Dhillon
 */
@EventBusSubscriber
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
