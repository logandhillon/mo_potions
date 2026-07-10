package net.ldm.mopotions.init;

import net.ldm.mopotions.MoPotionsMod;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = MoPotionsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoPotionsItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(
            ForgeRegistries.ITEMS, MoPotionsMod.MOD_ID);

    public static final RegistryObject<Item> FERMENTED_SUGAR = REGISTRY.register(
            "fermented_sugar",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));

    //public static final RegistryObject<Item> POTION_INFUSER = block(MoPotionsModBlocks.POTION_INFUSER,
    // CreativeModeTab.TAB_BREWING);

//	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
//		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab
//		(tab)));
//	}

    @SubscribeEvent
    public static void buildCreativeTabContents(BuildCreativeModeTabContentsEvent e) {
        if (e.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            e.accept(FERMENTED_SUGAR.get());
        }
    }
}
