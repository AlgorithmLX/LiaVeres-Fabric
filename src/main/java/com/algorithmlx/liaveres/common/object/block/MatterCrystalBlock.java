package com.algorithmlx.liaveres.common.object.block;

import net.minecraft.block.Block;

public class MatterCrystalBlock extends Block {
    public MatterCrystalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public float getBlastResistance() {
        return 999.9F;
    }
}