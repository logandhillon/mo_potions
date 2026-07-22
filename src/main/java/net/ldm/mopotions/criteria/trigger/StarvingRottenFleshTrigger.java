package net.ldm.mopotions.criteria.trigger;

import com.google.gson.JsonObject;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

/**
 * @author Logan Dhillon
 */
public class StarvingRottenFleshTrigger extends SimpleCriterionTrigger<StarvingRottenFleshTrigger.TriggerInstance> {
    public static final ResourceLocation ID =
            new ResourceLocation("mo_potions", "ate_rotten_flesh_while_starving");

    @Override
    protected StarvingRottenFleshTrigger.TriggerInstance createInstance(JsonObject obj,
                                                                        ContextAwarePredicate player,
                                                                        DeserializationContext ctx) {
        return new TriggerInstance(player);
    }

    @Override
    public ResourceLocation getId() {
        return ID;
    }

    public void trigger(ServerPlayer pPlayer) {
        trigger(pPlayer, instance -> true);
    }

    public static class TriggerInstance extends AbstractCriterionTriggerInstance {
        public TriggerInstance(ContextAwarePredicate player) {
            super(ID, player);
        }

        public static TriggerInstance instance() {
            return new TriggerInstance(ContextAwarePredicate.ANY);
        }
    }
}
