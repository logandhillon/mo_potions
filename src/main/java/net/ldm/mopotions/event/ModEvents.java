package net.ldm.mopotions.event;

import net.ldm.mopotions.MoPotionsMod;
import net.ldm.mopotions.init.ModCriteria;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

/**
 * @author Logan Dhillon
 */
@Mod.EventBusSubscriber(modid = MoPotionsMod.MOD_ID, bus = Bus.FORGE)
public class ModEvents {
    @SubscribeEvent
    public static void onItemConsumed(LivingEntityUseItemEvent.Finish event) {
        if (!(event.getEntity() instanceof ServerPlayer player))
            return;

        if (event.getItem().is(Items.ROTTEN_FLESH) && player.getFoodData().getFoodLevel() <= 5) // since post-eating
            ModCriteria.STARVING_ROTTEN_FLESH.trigger(player);
    }
}
