package io.github.cpearl0.erccore.data.tag;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.registry.ERCBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MyBlockTagsProvider extends BlockTagsProvider {
    public MyBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ERCCore.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ERCBlocks.ROOT_CORE.get(),
                ERCBlocks.CANOPY_NEXUS.get()
        );
    }
}
