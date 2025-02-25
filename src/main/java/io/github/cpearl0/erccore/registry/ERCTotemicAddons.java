package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import pokefenn.totemic.api.ceremony.Ceremony;
import pokefenn.totemic.api.registry.RegistryAPI;

public class ERCTotemicAddons {
    public static final DeferredRegister<Ceremony> CEREMONIES = DeferredRegister.create(RegistryAPI.CEREMONY_REGISTRY, ERCCore.MODID);

    public static void register(IEventBus eventBus) {
        CEREMONIES.register(eventBus);
    }
}
