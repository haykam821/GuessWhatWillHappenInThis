package fr.anatom3000.gwwhit.materials.ipacyk;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class IpacykRoot {
    public static final Item IPACYK_INGOT = new Item(new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    public static final Block IPACYK_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.17412402140856f, 1.9681537290110027f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0));
    public static final Block IPACYK_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.382447111002906f, 1.7733044710387258f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0));
    public static final ArmorMaterial ipacykArmorMaterial = new IpacykArmorMaterial();
    public static final IpacykHelmet IPACYK_HELMET = new IpacykHelmet(ipacykArmorMaterial);
    public static final IpacykChestplate IPACYK_CHESTPLATE = new IpacykChestplate(ipacykArmorMaterial);
    public static final IpacykLeggings IPACYK_LEGGINGS = new IpacykLeggings(ipacykArmorMaterial);
    public static final IpacykBoots IPACYK_BOOTS = new IpacykBoots(ipacykArmorMaterial);

    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "ipacyk_ingot"), IPACYK_INGOT);
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "ipacyk_block"), IPACYK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "ipacyk_block"), new BlockItem(IPACYK_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "ipacyk_ore"), IPACYK_ORE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "ipacyk_ore"), new BlockItem(IPACYK_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "ipacyk_helmet"), IPACYK_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "ipacyk_chestplate"), IPACYK_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "ipacyk_leggings"), IPACYK_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "ipacyk_boots"), IPACYK_BOOTS);
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit", "ore_ipacyk"));
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public void onInitializeClient() {

    }
}