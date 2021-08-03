package com.algorithmlx.liaveres;

import com.algorithmlx.liaveres.common.registry.ModBlocks;
import com.algorithmlx.liaveres.common.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class LiaVeres implements ModInitializer {

    public static final String ModId = "liaveres";
    @Override
    public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
    }
    public static final ItemGroup LiaVeres_GroupItems = FabricItemGroupBuilder.create(new Identifier(ModId, "liaveres_groupitems")).icon(() -> new ItemStack(ModItems.MatterCrystal)).build();
    public static final ItemGroup LiaVeres_GroupBlocks = FabricItemGroupBuilder.create(new Identifier(ModId, "liaveres_groupblocks")).icon(() -> new ItemStack(ModBlocks.MatterCrystalBlock)).build();
}