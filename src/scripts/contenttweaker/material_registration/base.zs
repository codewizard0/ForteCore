#priority 1149
#loader contenttweaker

import mods.contenttweaker.Material;
import mods.contenttweaker.MaterialPartData;

import scripts.contenttweaker.base.addDefaultMoltenData;
import scripts.contenttweaker.base.addDefaultOreData;
import scripts.contenttweaker.base.materials;

/*
	Large-scale registration
*/
//==================================
//Add default parts for materials
var materialsForDefaultParts as Material[] = [
    // TODO: Implement
];

var defaultPartNames as string[] = [
	"gear",
	"plate",
	"rod"
];

for i, metal in materialsForDefaultParts {
	metal.registerParts(defaultPartNames);
}

//==================================
//Apply Molten to Materials
var fluidMaterials as Material[] = [
    // TODO: Implement
];

for i, fluid in fluidMaterials {
	var fluidMaterialsData as MaterialPartData = fluid.registerPart("molten").getData();
	addDefaultMoltenData(fluidMaterialsData);
}

//==================================
//Custom gears to keep the same look
var gearMaterialList as Material[] = [
	materials.diamond,
	materials.gold,
	materials.iron
];

for material in gearMaterialList {
	material.registerPart("gear");
}

//==================================
//Ore Samples
var oreSampleMaterials as Material[] = [
    // TODO: Implement
];

var oreSampleDrops as string[Material] = {
    // TODO: Implement
};

for material in oreSampleMaterials {
	var sampleData as MaterialPartData = material.registerPart("ore_sample").getData();
	sampleData.addDataValue("drops", oreSampleDrops[material]);
}

//==================================
//Clusters
var clusters as Material[] = [
    // TODO: Implement
];

for material in clusters {
	material.registerPart("cluster");
}


/*
	Misc Part Registration
*/

//Stone Nugget
materials.stone.registerPart("nugget");

//Liquid Ender Pearl
var fluidEnderData = materials.ender.registerPart("molten").getData();
addDefaultMoltenData(fluidEnderData);

//Liquid Redstone
var fluidRedstoneData = materials.redstone.registerPart("molten").getData();
fluidRedstoneData.addDataValue("density", "8000");
fluidRedstoneData.addDataValue("viscosity", "3000");
fluidRedstoneData.addDataValue("temperature", "1000");
fluidRedstoneData.addDataValue("vaporize", "false");

//Liquid Glowstone
var fluidGlowstoneData = materials.glowstone.registerPart("molten").getData();
fluidGlowstoneData.addDataValue("density", "8000");
fluidGlowstoneData.addDataValue("viscosity", "3000");
fluidGlowstoneData.addDataValue("temperature", "1000");
fluidGlowstoneData.addDataValue("vaporize", "false");