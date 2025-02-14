package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ERCBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ERCCore.MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
