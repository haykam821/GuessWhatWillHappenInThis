package fr.anatom3000.gwwhit.materials.iqecoln;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
public class IqecolnOre extends Block {
public IqecolnOre() {super(FabricBlockSettings.of(Material.STONE).strength(2.821530597791218f,2.387309768714658f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0));}

}