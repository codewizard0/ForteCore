#priority 1150
#loader contenttweaker

import mods.contenttweaker.Color;
import mods.contenttweaker.Material;
import mods.contenttweaker.MaterialPartData;
import mods.contenttweaker.MaterialSystem;

static materials as Material[string] = {
    "diamond": MaterialSystem.getMaterialBuilder().setName("Diamond").setColor(9237730).build(),
    "ender": MaterialSystem.getMaterialBuilder().setName("Ender Pearl").setColor(2869678).build(),
	"glowstone": MaterialSystem.getMaterialBuilder().setName("Glowstone").setColor(16708616).build(),
	"gold": MaterialSystem.getMaterialBuilder().setName("Gold").setColor(16776971).build(),
	"iron": MaterialSystem.getMaterialBuilder().setName("Iron").setColor(14211288).build(),
	"redstone": MaterialSystem.getMaterialBuilder().setName("Redstone").setColor(9895936).build(),
	"stone": MaterialSystem.getMaterialBuilder().setName("Stone").setColor(11117475).build()
    // TODO: Implement
};

/*
	Functions
*/
function addDefaultMoltenData(moltenData as MaterialPartData) {
	moltenData.addDataValue("density", "4000");
	moltenData.addDataValue("viscosity", "3000");
	moltenData.addDataValue("temperature", "550");
	moltenData.addDataValue("vaporize", "false");
}

function addDefaultOreData(oreData as MaterialPartData) {
	oreData.addDataValue("variants", "minecraft:stone");
	oreData.addDataValue("hardness", "5");
	oreData.addDataValue("resistance", "15");
	oreData.addDataValue("harvestTool", "pickaxe");
	oreData.addDataValue("harvestLevel", "2");
}
