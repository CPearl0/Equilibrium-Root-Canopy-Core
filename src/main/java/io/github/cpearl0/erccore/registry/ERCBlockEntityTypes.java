package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.content.block.StabilizerBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ERCBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ERCCore.MODID);

    public static final Supplier<BlockEntityType<StabilizerBlockEntity>> STABILIZER_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "stabilizer_block_entity",
            () -> BlockEntityType.Builder.of(
                    StabilizerBlockEntity::new,
                    ERCBlocks.ROOT_CORE.get(), ERCBlocks.CANOPY_NEXUS.get()
            ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
