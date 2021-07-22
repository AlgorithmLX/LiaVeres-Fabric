package com.algorithmlx.liaveres.common.object.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MatterCrystal extends Item {
    public MatterCrystal(Settings settings) {
        super(settings);
        settings.group(ItemGroup.MATERIALS);
    }
}
