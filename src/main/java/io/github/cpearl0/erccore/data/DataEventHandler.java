package io.github.cpearl0.erccore.data;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.data.lang.EnglishLanguageProvider;
import io.github.cpearl0.erccore.data.loot.MyLootProvider;
import io.github.cpearl0.erccore.data.model.MyBlockStateProvider;
import io.github.cpearl0.erccore.data.tag.MyBlockTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = ERCCore.MODID)
public class DataEventHandler {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new EnglishLanguageProvider(output));
        generator.addProvider(event.includeClient(), new MyBlockStateProvider(output, existingFileHelper));

        generator.addProvider(event.includeServer(), new MyLootProvider(output, lookupProvider));
        generator.addProvider(event.includeServer(), new MyBlockTagsProvider(output, lookupProvider, existingFileHelper));
    }
}
