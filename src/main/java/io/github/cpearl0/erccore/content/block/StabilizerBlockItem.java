package io.github.cpearl0.erccore.content.block;

import io.github.cpearl0.erccore.registry.ERCAttachmentTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;

public class StabilizerBlockItem extends BlockItem {
    public StabilizerBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public InteractionResult place(BlockPlaceContext context) {
        var res = super.place(context);
        if (context.getLevel().isClientSide() ||  !res.consumesAction())
            return res;

        var chunk = context.getLevel().getChunkAt(context.getClickedPos());
        var element = ((StabilizerBlock) getBlock()).element;
        var pos = chunk.getData(ERCAttachmentTypes.CHUNK_STABILIZER_INFO).stabilizerPos[element];
        // If there is already a stabilizer of the same element, don't place another one
        if (pos != null &&
                chunk.getBlockState(pos).getBlock() instanceof StabilizerBlock stabilizer &&
                element == stabilizer.element)
            context.getPlayer().sendSystemMessage(Component.translatable("Don't do that"));
        return res;
    }
}
