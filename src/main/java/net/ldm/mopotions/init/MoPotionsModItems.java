package net.ldm.mopotions.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.ldm.mopotions.MoPotionsMod;

public class MoPotionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoPotionsMod.MOD_ID);
	public static final RegistryObject<Item> FERMENTED_SUGAR = REGISTRY.register("fermented_sugar", () -> new Item(new Item.Properties().tab(
            CreativeModeTab.TAB_BREWING).stacksTo(64).rarity(Rarity.COMMON)));
	//public static final RegistryObject<Item> POTION_INFUSER = block(MoPotionsModBlocks.POTION_INFUSER, CreativeModeTab.TAB_BREWING);

//	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
//		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
//	}
}
