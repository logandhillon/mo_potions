package net.ldm.mopotions.init;

import net.ldm.mopotions.MoPotions;
import net.ldm.mopotions.criteria.trigger.StarvingRottenFleshTrigger;
import net.minecraft.advancements.CriterionTrigger;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * @author Logan Dhillon
 */
public class ModCriteria {
    public static final DeferredRegister<CriterionTrigger<?>> REGISTRY =
            DeferredRegister.create(Registries.TRIGGER_TYPE, MoPotions.MOD_ID);

    public static final DeferredHolder<CriterionTrigger<?>, StarvingRottenFleshTrigger> STARVING_ROTTEN_FLESH =
            REGISTRY.register("starving_rotten_flesh", StarvingRottenFleshTrigger::new);
}