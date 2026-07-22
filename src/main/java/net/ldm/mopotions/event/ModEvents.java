package net.ldm.mopotions.event;

import net.ldm.mopotions.init.ModCriteria;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;

/**
 * @author Logan Dhillon
 */
@EventBusSubscriber
public class ModEvents {
    @SubscribeEvent
    public static void onItemConsumed(LivingEntityUseItemEvent.Finish event) {
        if (!(event.getEntity() instanceof ServerPlayer player))
            return;

        if (event.getItem().is(Items.ROTTEN_FLESH) && player.getFoodData().getFoodLevel() <= 5) // since post-eating
            ModCriteria.STARVING_ROTTEN_FLESH.get().trigger(player);
    }
}
