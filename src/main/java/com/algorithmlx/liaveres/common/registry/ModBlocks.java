package com.algorithmlx.liaveres.common.registry;

import com.algorithmlx.liaveres.common.object.block.MatterCrystalBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class ModBlocks {

    public static final Block MatterCrystalBlock = registerBlock("matter_crystal_block", new MatterCrystalBlock(FabricBlockSettings.of(Material.STONE)));

    private static Block registerBlock(String matter_crystal_block, MatterCrystalBlock matterCrystalBlock) {
        return null;
    }

    public static void init() {}
}