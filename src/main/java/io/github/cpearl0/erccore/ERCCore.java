package io.github.cpearl0.erccore;

import io.github.cpearl0.erccore.registry.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(ERCCore.MODID)
public class ERCCore {
    public static final String MODID = "erccore";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final int ROOT = 0;
    public static final int CANOPY = 1;

    public ERCCore(IEventBus modEventBus, ModContainer modContainer) {
        ERCItems.register(modEventBus);
        ERCBlocks.register(modEventBus);
        ERCBlockEntityTypes.register(modEventBus);
        ERCCreativeTabs.register(modEventBus);
        ERCAttachmentTypes.register(modEventBus);

        ERCTotemicAddons.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
