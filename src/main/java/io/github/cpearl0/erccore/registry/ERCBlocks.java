package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.content.block.StabilizerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ERCBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ERCCore.MODID);

    public static final DeferredBlock<StabilizerBlock> ROOT_CORE = createStabilizerBlock("root_core", ERCCore.ROOT);
    public static final DeferredBlock<StabilizerBlock> CANOPY_NEXUS = createStabilizerBlock("canopy_nexus", ERCCore.CANOPY);
    private static DeferredBlock<StabilizerBlock> createStabilizerBlock(String name, int element) {
        return BLOCKS.register(name, registryName ->
                new StabilizerBlock(BlockBehaviour.Properties.of(),
                        element));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
