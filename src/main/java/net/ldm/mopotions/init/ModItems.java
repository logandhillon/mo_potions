package net.ldm.mopotions.init;

import net.ldm.mopotions.MoPotions;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber
public class ModItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MoPotions.MOD_ID);

    public static final DeferredItem<Item> FERMENTED_SUGAR = REGISTRY.register(
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
