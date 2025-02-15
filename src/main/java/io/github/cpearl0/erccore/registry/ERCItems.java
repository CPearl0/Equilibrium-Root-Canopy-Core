package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ERCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ERCCore.MODID);

    public static final DeferredItem<BlockItem> ROOT_CORE = ITEMS.registerSimpleBlockItem(ERCBlocks.ROOT_CORE);
    public static final DeferredItem<BlockItem> CANOPY_NEXUS = ITEMS.registerSimpleBlockItem(ERCBlocks.CANOPY_NEXUS);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
