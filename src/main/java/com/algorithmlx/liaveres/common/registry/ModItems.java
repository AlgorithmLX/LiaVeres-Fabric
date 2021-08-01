package com.algorithmlx.liaveres.common.registry;

import com.algorithmlx.liaveres.common.object.item.MatterCrystal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ModItems {
    public static final Item MatterCrystal = registerItem("matter_crystal", new MatterCrystal(new FabricItemSettings()));

    private static Item registerItem(String matter_crystal, MatterCrystal matterCrystal) {
        return null;
    }

    public static final Item MatterCrystalBlock = registerItem("matter_crystal_block", new BlockItem(ModBlocks.MatterCrystalBlock, new FabricItemSettings()));

    private static Item registerItem(String matter_crystal_block, BlockItem blockItem) {
        return null;
    }

    public static void init() {
    }
}