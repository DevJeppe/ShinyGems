package com.skunkyzx.toolsplus.util;

import com.skunkyzx.toolsplus.ToolsPlus;
import com.skunkyzx.toolsplus.armor.ModArmorMaterial;
import com.skunkyzx.toolsplus.blocks.*;
import com.skunkyzx.toolsplus.items.ItemBase;
import com.skunkyzx.toolsplus.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ToolsPlus.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ToolsPlus.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);
    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", SapphireBlock::new);
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", SapphireOre::new);
    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 3, -2.4F, new Item.Properties().group(ToolsPlus.TOOLSP)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.4F, new Item.Properties().group(ToolsPlus.TOOLSP)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 0, -2.4F, new Item.Properties().group(ToolsPlus.TOOLSP)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 6, -3.1F, new Item.Properties().group(ToolsPlus.TOOLSP)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, 0, -1.0F, new Item.Properties().group(ToolsPlus.TOOLSP)));
    //Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(ToolsPlus.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(ToolsPlus.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(ToolsPlus.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(ToolsPlus.TAB)));
}
