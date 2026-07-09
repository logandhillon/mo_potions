//package net.ldm.mopotions.init;
//
//import net.ldm.mopotions.MoPotionsMod;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//public class MoPotionsModBlockEntities {
//    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(
//            ForgeRegistries.BLOCK_ENTITY_TYPES, MoPotionsMod.MODID);
//    public static final RegistryObject<BlockEntityType<?>> POTION_INFUSER = register("potion_infuser",
//     MoPotionsModBlocks.POTION_INFUSER, PotionInfuserBlockEntity::new);
//
//    private static RegistryObject<BlockEntityType<?>> register(String id, RegistryObject<Block> block,
//                                                               BlockEntityType.BlockEntitySupplier<?> supplier) {
//        return REGISTRY.register(id, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
//    }
//}
