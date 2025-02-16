package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.utils.ChunkStabilizerInfo;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ERCAttachmentTypes {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, ERCCore.MODID);

    public static final Supplier<AttachmentType<ChunkStabilizerInfo>> CHUNK_STABILIZER_INFO = ATTACHMENT_TYPES.register(
            "chunk_stabilizer_info",
            () -> AttachmentType.serializable(ChunkStabilizerInfo::new).build());

    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);
    }
}
