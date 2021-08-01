package com.algorithmlx.liaveres;

import com.algorithmlx.liaveres.common.registry.ModBlocks;
import com.algorithmlx.liaveres.common.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class LiaVeres implements ModInitializer {

    public static final String ModId = "lv";
    @Override
    public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
    }
}