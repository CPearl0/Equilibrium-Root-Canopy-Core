package io.github.cpearl0.erccore.registry;

import io.github.cpearl0.erccore.ERCCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ERCCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ERCCore.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.erccore")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            //.icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
            //    output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
