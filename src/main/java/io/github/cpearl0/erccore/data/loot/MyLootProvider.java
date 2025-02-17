package io.github.cpearl0.erccore.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MyLootProvier extends LootTableProvider {
    public MyLootProvier(PackOutput output) {
        super(output, Set.of(), List.of(
                new SubProviderEntry(MyBlockLootSubProvider::new, LootContextParamSets.BLOCK)
        ));
    }
}
