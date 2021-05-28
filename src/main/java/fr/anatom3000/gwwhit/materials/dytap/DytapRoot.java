package fr.anatom3000.gwwhit.materials.dytap;

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

public class DytapRoot {
    public static final Item DYTAP = new Item(new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    public static final DytapBlock DYTAP_BLOCK = new DytapBlock();
    public static final Block DYTAP_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.999940103251278f, 3.6295528662994885f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0));
    public static final DytapShovel DYTAP_SHOVEL = new DytapShovel(DytapMaterial.INSTANCE);
    public static final DytapPickaxe DYTAP_PICKAXE = new DytapPickaxe(DytapMaterial.INSTANCE);
    public static final DytapAxe DYTAP_AXE = new DytapAxe(DytapMaterial.INSTANCE);
    public static final DytapHoe DYTAP_HOE = new DytapHoe(DytapMaterial.INSTANCE);

    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "dytap"), DYTAP);
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "dytap_block"), DYTAP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "dytap_block"), new BlockItem(DYTAP_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "dytap_ore"), DYTAP_ORE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "dytap_ore"), new BlockItem(DYTAP_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "dytap_shovel"), DYTAP_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "dytap_pickaxe"), DYTAP_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "dytap_axe"), DYTAP_AXE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "dytap_hoe"), DYTAP_HOE);
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit", "ore_dytap"));
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public void onInitializeClient() {

    }
}