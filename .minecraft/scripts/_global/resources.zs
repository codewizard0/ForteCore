#priority 750

import crafttweaker.oredict.IOreDictEntry;

//Resource unification
/*
	RESOURCES_TYPE: {
		block: ORE_DICT_ENTRY,
		output: ORE_DICT_ENTRY,
		ore: ORE_DICT_ENTRY
	}
*/
global resources as IOreDictEntry[string][string] = {
	coal: {
		block: <ore:blockCoal>,
		output: <ore:coal>,
		ore: <ore:oreCoal>
	},
	diamond: {
		block: <ore:blockDiamond>,
		output: <ore:gemDiamond>,
		ore: <ore:oreDiamond>
	},
	emerald: {
		block: <ore:blockEmerald>,
		output: <ore:gemEmerald>,
		ore: <ore:oreEmerald>
	},
	lapis: {
		block: <ore:blockLapis>,
		output: <ore:gemLapis>,
		ore: <ore:oreLapis>
	},
	quartz: {
		block: <ore:blockQuartz>,
		output: <ore:gemQuartz>,
		ore: <ore:oreQuartz>
	},
	redstone: {
		block: <ore:blockRedstone>,
		output: <ore:dustRedstone>,
		ore: <ore:oreRedstone>
	}
    // TODO: Implement
};