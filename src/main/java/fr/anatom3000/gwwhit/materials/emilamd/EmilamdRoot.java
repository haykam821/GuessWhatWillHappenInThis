package fr.anatom3000.gwwhit.materials.emilamd;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class EmilamdRoot {
    public static final Item EMILAMD_INGOT = new Item(new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    public static final Block EMILAMD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.6159729501878695f, 4.114099399066217f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0));
    public static final Block EMILAMD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.000558898654879f, 2.424559117826216f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).luminance(5));
    public static final EmilamdSword EMILAMD_SWORD = new EmilamdSword(EmilamdMaterial.INSTANCE);

    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "emilamd_ingot"), EMILAMD_INGOT);
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "emilamd_block"), EMILAMD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "emilamd_block"), new BlockItem(EMILAMD_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "emilamd_ore"), EMILAMD_ORE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "emilamd_ore"), new BlockItem(EMILAMD_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "emilamd_sword"), EMILAMD_SWORD);
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit", "ore_emilamd"));
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public void onInitializeClient() {

    }
}