package net.ldm.mopotions.criteria.trigger;

import com.mojang.serialization.Codec;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.CriterionValidator;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.server.level.ServerPlayer;

import java.util.Optional;

/**
 * @author Logan Dhillon
 */
public class StarvingRottenFleshTrigger extends SimpleCriterionTrigger<StarvingRottenFleshTrigger.TriggerInstance> {

    @Override
    public Codec<TriggerInstance> codec() {
        return TriggerInstance.CODEC;
    }

    public void trigger(ServerPlayer player) {
        trigger(player, instance -> true);
    }

    public static record TriggerInstance(
            Optional<ContextAwarePredicate> player) implements SimpleCriterionTrigger.SimpleInstance {
        public static final Codec<TriggerInstance> CODEC =
                ContextAwarePredicate.CODEC.optionalFieldOf("player")
                                           .xmap(TriggerInstance::new, TriggerInstance::player)
                                           .codec();

        @Override
        public void validate(CriterionValidator validator) {
            SimpleCriterionTrigger.SimpleInstance.super.validate(validator);
        }

        public static TriggerInstance instance() {
            return new TriggerInstance(Optional.empty());
        }
    }
}
