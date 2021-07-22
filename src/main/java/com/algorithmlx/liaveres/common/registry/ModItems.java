package com.algorithmlx.liaveres.common.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import static com.algorithmlx.liaveres.common.registry.ModItems.registerItem;

public class ModItems {
    public static final Item MatterCrystal = registerItem("ruby", new RubyItem(new FabricItemSettings()));

    public static void init() {
    }
}
