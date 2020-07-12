package com.skunkyzx.toolsplus.world.gen;

import com.skunkyzx.toolsplus.ToolsPlus;
import com.skunkyzx.toolsplus.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ToolsPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGen
{
    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE));

    @SubscribeEvent
    public static void GenerateOre(FMLLoadCompleteEvent events)
    {
        for (Biome biome : ForgeRegistries.BIOMES)
        {
            //Nether Generation
            if(biome.getCategory() == Biome.Category.NETHER)
            {
                //genOre(biome, 10, 12, 5, 80, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.RUBY_ORE.get().getDefaultState(), 4);
            }
            //End Generation
            else if (biome.getCategory() == Biome.Category.THEEND)
            {
                //genOre(biome, 10, 12, 5, 80, END_STONE, RegistryHandler.RUBY_ORE.get().getDefaultState(), 5);
            }
            //Overworld Generation
            else
            {
                /* Spawns in a specific biome
                if (biome == Biomes.PLAINS)
                {
                    genOre(biome, 10, 12, 5, 47, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE.get().getDefaultState(), 5);
                }
                */

                genOre(biome, 10, 12, 5, 47, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.RUBY_ORE.get().getDefaultState(), 5);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size)
    {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
