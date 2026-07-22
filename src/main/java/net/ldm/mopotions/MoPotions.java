package net.ldm.mopotions;

import net.ldm.mopotions.init.ModMobEffects;
import net.ldm.mopotions.init.ModItems;
import net.ldm.mopotions.init.ModPotions;
import net.ldm.mopotions.init.ModCriteria;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mo_potions")
public class MoPotions {
    public static final Logger LOGGER = LogManager.getLogger(MoPotions.class);
    public static final String MOD_ID = "mo_potions";

    public MoPotions(IEventBus bus, ModContainer container) {
//		MoPotionsModBlocks.REGISTRY.register(bus);
//		MoPotionsModBlockEntities.REGISTRY.register(bus);
        ModItems.REGISTRY.register(bus);
        ModMobEffects.REGISTRY.register(bus);
        ModPotions.REGISTRY.register(bus);
        ModCriteria.REGISTRY.register(bus);
    }
}
