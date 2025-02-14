package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ERCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ERCCore.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
