package com.algorithmlx.liaveres.common.registry;

import com.algorithmlx.liaveres.LiaVeres;;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //ITEM
    public static final Item MATTER_CRYSTAL =  new Item(new Item.Settings().group(LiaVeres.LiaVeres_GroupItems));
    public static final Item MATTER =  new Item(new Item.Settings());

    //BlockItems
    public static final BlockItem MATTER_CRYSTAL_BLOCK = new BlockItem(ModBlocks.MATTER_CRYSTAL_BLOCK, new Item.Settings().group(LiaVeres.LiaVeres_GroupBlocks));

    public static void registerItems() {
        //Reg Item
        Registry.register(Registry.ITEM, new Identifier(LiaVeres.ModId, "matter_crytal"), MATTER_CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(LiaVeres.ModId, "matter"), MATTER);
        //Reg Block
        Registry.register(Registry.ITEM, new Identifier(LiaVeres.ModId, "matter_crystal_block"), MATTER_CRYSTAL_BLOCK);
    }
}