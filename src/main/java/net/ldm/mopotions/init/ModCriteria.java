package net.ldm.mopotions.init;

import net.ldm.mopotions.criteria.trigger.StarvingRottenFleshTrigger;
import net.minecraft.advancements.CriteriaTriggers;

/**
 * @author Logan Dhillon
 */
public class ModCriteria {
    public static final StarvingRottenFleshTrigger STARVING_ROTTEN_FLESH =
            new StarvingRottenFleshTrigger();

    public static void init() {
        CriteriaTriggers.register(STARVING_ROTTEN_FLESH);
    }
}
