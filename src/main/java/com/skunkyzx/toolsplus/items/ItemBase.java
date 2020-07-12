package com.skunkyzx.toolsplus.items;

import com.skunkyzx.toolsplus.ToolsPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item
{

    public ItemBase()
    {
        super(new Item.Properties().group(ToolsPlus.TAB));
    }
}
