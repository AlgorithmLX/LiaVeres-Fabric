package com.algorithmlx.liaveres.common.registry;

import com.algorithmlx.liaveres.LiaVeres;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MATTER_CRYSTAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 5).requiresTool().strength(500F, 1800000000.0f).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(LiaVeres.ModId, "matter_crystal_block"), MATTER_CRYSTAL_BLOCK);
    }
}
