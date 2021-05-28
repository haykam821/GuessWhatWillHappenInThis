package fr.anatom3000.gwwhit.materials.senuz;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SenuzSword extends SwordItem {
    public SenuzSword(ToolMaterial material) {
        super(material, 6, 0.4613857564565763f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}