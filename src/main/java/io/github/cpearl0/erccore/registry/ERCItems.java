package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.content.block.StabilizerBlockItem;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ERCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ERCCore.MODID);

    public static final DeferredItem<StabilizerBlockItem> ROOT_CORE = createStabilizerBlockItem(ERCBlocks.ROOT_CORE);
    public static final DeferredItem<StabilizerBlockItem> CANOPY_NEXUS = createStabilizerBlockItem(ERCBlocks.CANOPY_NEXUS);
    private static DeferredItem<StabilizerBlockItem> createStabilizerBlockItem(Holder<Block> block) {
        return ITEMS.register(block.unwrapKey().orElseThrow().location().getPath(),
                () -> new StabilizerBlockItem(block.value(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
