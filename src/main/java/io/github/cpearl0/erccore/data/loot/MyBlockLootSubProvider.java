package io.github.cpearl0.erccore.data.loot;

import io.github.cpearl0.erccore.registry.ERCBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class MyBlockLootSubProvider extends BlockLootSubProvider {
    protected MyBlockLootSubProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        // The contents of our DeferredRegister.
        return ERCBlocks.BLOCKS.getEntries()
                .stream()
                .map(e -> (Block) e.value())
                .toList();
    }

    @Override
    protected void generate() {
        getKnownBlocks().forEach(this::dropSelf);
    }
}
