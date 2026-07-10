package net.ldm.mopotions;

import net.ldm.mopotions.init.MoPotionsItems;
import net.ldm.mopotions.init.MoPotionsEffects;
import net.ldm.mopotions.init.MoPotionsPotions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mo_potions")
public class MoPotionsMod {
    public static final Logger LOGGER = LogManager.getLogger(MoPotionsMod.class);
    public static final String MOD_ID = "mo_potions";

    public MoPotionsMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
//		MoPotionsModBlocks.REGISTRY.register(bus);
//		MoPotionsModBlockEntities.REGISTRY.register(bus);
        MoPotionsItems.REGISTRY.register(bus);
        MoPotionsEffects.REGISTRY.register(bus);
        MoPotionsPotions.REGISTRY.register(bus);
    }
}
