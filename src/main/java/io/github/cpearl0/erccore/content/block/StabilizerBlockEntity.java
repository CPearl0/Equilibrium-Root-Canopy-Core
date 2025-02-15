package io.github.cpearl0.erccore.content.block;

import io.github.cpearl0.erccore.registry.ERCBlockEntityTypes;
import lombok.Getter;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class StabilizerBlockEntity extends BlockEntity {
    @Getter
    private double value = 0;
    public static final double MAXVALUE = 10000.0;

    public StabilizerBlockEntity(BlockPos pos, BlockState blockState) {
        super(ERCBlockEntityTypes.STABILIZER_BLOCK_ENTITY.get(), pos, blockState);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        value = tag.getDouble("value");
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putDouble("value", value);
    }
}
