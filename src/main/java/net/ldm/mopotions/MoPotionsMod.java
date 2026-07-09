package net.ldm.mopotions;

import net.ldm.mopotions.init.MoPotionsModItems;
import net.ldm.mopotions.init.MoPotionsModMobEffects;
import net.ldm.mopotions.init.MoPotionsModPotions;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Mod("mo_potions")
public class MoPotionsMod {
    public static final  Logger        LOGGER           = LogManager.getLogger(MoPotionsMod.class);
    public static final  String        MOD_ID           = "mo_potions";
    private static final String        PROTOCOL_VERSION = "1";
    public static final  SimpleChannel PACKET_HANDLER   = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(MOD_ID, MOD_ID), () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

    private static int messageID = 0;

    public MoPotionsMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
//		MoPotionsModBlocks.REGISTRY.register(bus);
        MoPotionsModItems.REGISTRY.register(bus);

//		MoPotionsModBlockEntities.REGISTRY.register(bus);

        MoPotionsModMobEffects.REGISTRY.register(bus);
        MoPotionsModPotions.REGISTRY.register(bus);
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder,
                                             Function<FriendlyByteBuf, T> decoder,
                                             BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }
}
