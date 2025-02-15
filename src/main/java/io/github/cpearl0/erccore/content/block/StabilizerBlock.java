package io.github.cpearl0.erccore.content.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class StabilizerBlock extends Block implements EntityBlock {
    public final int element;
    public StabilizerBlock(Properties properties, int element) {
        super(properties);
        this.element = element;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StabilizerBlockEntity(pos, state);
    }
}
