#priority 750

import crafttweaker.item.IIngredient;

//Metal unification
/*
	METAL_TYPE: {
		block: ITEM_STACK,
		dust: ITEM_STACK,
		gear: ITEM_STACK,
		ingot: ITEM_STACK,
		liquid: <liquid:lava>,
		nugget: ITEM_STACK,
		plate: ITEM_STACK,
		rod: ITEM_STACK
	}
*/
global metalItems as IIngredient[string][string] = {
	gold: {
		block: <ore:blockGold>,
		clump: <ore:clumpGold>,
		crystal: <ore:crystalGold>,
		dirtyDust: <ore:dustDirtyGold>,
		dust: <ore:dustGold>,
		gear: <ore:gearGold>,
		ingot: <ore:ingotGold>,
		nugget: <ore:nuggetGold>,
		ore: <ore:oreGold>,
		plate: <ore:plateGold>,
		rod: <ore:rodGold>,
		shard: <ore:shardGold>
	},
	iron: {
		block: <ore:blockIron>,
		clump: <ore:clumpIron>,
		crystal: <ore:crystalIron>,
		dirtyDust: <ore:dustDirtyIron>,
		dust: <ore:dustIron>,
		gear: <ore:gearIron>,
		ingot: <ore:ingotIron>,
		nugget: <ore:nuggetIron>,
		ore: <ore:oreIron>,
		plate: <ore:plateIron>,
		rod: <ore:rodIron>,
		shard: <ore:shardIron>
	}
    // TODO: Implement
};
