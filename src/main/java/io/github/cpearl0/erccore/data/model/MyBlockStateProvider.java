package io.github.cpearl0.erccore.data.model;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.registry.ERCBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MyBlockStateProvider extends BlockStateProvider {
    public MyBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ERCCore.MODID, existingFileHelper);
    }

    private void simpleBlockWithItem(Block block) {
        simpleBlockWithItem(block, cubeAll(block));
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ERCBlocks.ROOT_CORE.get(),
                models().withExistingParent("root_core", modLoc("stabilizer_block"))
                        .texture("all", modLoc("block/root_core")));
        simpleBlockWithItem(ERCBlocks.CANOPY_NEXUS.get(),
                models().withExistingParent("canopy_nexus", modLoc("stabilizer_block"))
                        .texture("all", modLoc("block/canopy_nexus")));
    }
}
