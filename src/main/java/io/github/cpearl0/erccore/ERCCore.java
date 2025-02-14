package io.github.cpearl0.erccore;

import io.github.cpearl0.erccore.registry.ERCBlocks;
import io.github.cpearl0.erccore.registry.ERCCreativeTabs;
import io.github.cpearl0.erccore.registry.ERCItems;
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

    public ERCCore(IEventBus modEventBus, ModContainer modContainer) {
        ERCItems.register(modEventBus);
        ERCBlocks.register(modEventBus);
        ERCCreativeTabs.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
