package io.github.cpearl0.erccore.utils;

import io.github.cpearl0.erccore.ERCCore;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.neoforged.neoforge.common.util.INBTSerializable;
import org.jetbrains.annotations.UnknownNullability;

public class ChunkStabilizerInfo implements INBTSerializable<CompoundTag> {
    public BlockPos[] stabilizerPos = new BlockPos[2];

    @Override
    public @UnknownNullability CompoundTag serializeNBT(HolderLookup.Provider provider) {
        CompoundTag tag = new CompoundTag();
        if (stabilizerPos[ERCCore.ROOT] != null) {
            tag.putIntArray("root", new int[]{
                    stabilizerPos[ERCCore.ROOT].getX(),
                    stabilizerPos[ERCCore.ROOT].getY(),
                    stabilizerPos[ERCCore.ROOT].getZ(),
            });
        }
        if (stabilizerPos[ERCCore.CANOPY] != null) {
            tag.putIntArray("canopy", new int[]{
                    stabilizerPos[ERCCore.CANOPY].getX(),
                    stabilizerPos[ERCCore.CANOPY].getY(),
                    stabilizerPos[ERCCore.CANOPY].getZ(),
            });
        }
        return tag;
    }

    @Override
    public void deserializeNBT(HolderLookup.Provider provider, CompoundTag nbt) {
        var rootPos = nbt.getIntArray("root");
        var canopyPos = nbt.getIntArray("canopy");
        if (rootPos.length == 3) {
            stabilizerPos[ERCCore.ROOT] = new BlockPos(rootPos[0], rootPos[1], rootPos[2]);
        }
        if (canopyPos.length == 3) {
            stabilizerPos[ERCCore.CANOPY] = new BlockPos(canopyPos[0], canopyPos[1], canopyPos[2]);
        }
    }
}
