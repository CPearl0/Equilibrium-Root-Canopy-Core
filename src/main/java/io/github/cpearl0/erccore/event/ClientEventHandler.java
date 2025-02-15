package io.github.cpearl0.erccore.event;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.content.block.StabilizerBlockEntity;
import io.github.cpearl0.erccore.registry.ERCBlocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = ERCCore.MODID, value = Dist.CLIENT)
public class ClientEventHandler {
    @SubscribeEvent
    public static void registerBlockColorHandlers(RegisterColorHandlersEvent.Block event) {
        event.register((state, level, pos, tintIndex) -> {
            if (!(level.getBlockEntity(pos) instanceof StabilizerBlockEntity blockEntity))
                return 0xFFFFFFFF;
            int color = 0x3F + (int) Math.round(0xC0 * (blockEntity.getValue() / StabilizerBlockEntity.MAXVALUE));
            return color + (color << 8) + (color << 16);
        }, ERCBlocks.ROOT_CORE.get(), ERCBlocks.CANOPY_NEXUS.get());
    }
}
