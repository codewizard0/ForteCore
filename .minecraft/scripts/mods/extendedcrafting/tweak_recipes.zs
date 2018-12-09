#priority 2000

import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

function init() {
    var removeItems as IItemStack[] = [
        <extendedcrafting:compressor>,
        <extendedcrafting:crafting_core>,
        <extendedcrafting:crafting_table>,
        <extendedcrafting:ender_alternator>,
        <extendedcrafting:ender_crafter>,
        <extendedcrafting:frame>,
        <extendedcrafting:handheld_table>,
        <extendedcrafting:interface>,
        <extendedcrafting:lamp>,
        <extendedcrafting:lamp:1>,
        <extendedcrafting:material>,
        <extendedcrafting:material:7>,
        <extendedcrafting:material:24>,
        <extendedcrafting:material:32>,
        <extendedcrafting:material:36>,
        <extendedcrafting:material:40>,
        <extendedcrafting:material:48>,
        <extendedcrafting:pedestal>,
        <extendedcrafting:table_basic>,
        <extendedcrafting:table_advanced>,
        <extendedcrafting:table_elite>,
        <extendedcrafting:table_ultimate>
    ];

    for item in removeItems {
        recipes.remove(item);
        mods.extendedcrafting.TableCrafting.remove(item);
        mods.extendedcrafting.EnderCrafting.remove(item);
    }

    var recipeMapShaped = {
        <extendedcrafting:material>: [
            [<extendedcrafting:material:1>, <extendedcrafting:material:1>, <extendedcrafting:material:1>],
            [<extendedcrafting:material:1>, <extendedcrafting:material:1>, <extendedcrafting:material:1>],
            [<extendedcrafting:material:1>, <extendedcrafting:material:1>, <extendedcrafting:material:1>]
        ],
        <extendedcrafting:material:24>: [
            [<extendedcrafting:material:25>, <extendedcrafting:material:25>, <extendedcrafting:material:25>],
            [<extendedcrafting:material:25>, <extendedcrafting:material:25>, <extendedcrafting:material:25>],
            [<extendedcrafting:material:25>, <extendedcrafting:material:25>, <extendedcrafting:material:25>]
        ],
        <extendedcrafting:material:36>: [
            [<extendedcrafting:material:37>, <extendedcrafting:material:37>, <extendedcrafting:material:37>],
            [<extendedcrafting:material:37>, <extendedcrafting:material:37>, <extendedcrafting:material:37>],
            [<extendedcrafting:material:37>, <extendedcrafting:material:37>, <extendedcrafting:material:37>]
        ],
        <extendedcrafting:material:40>: [
            [<extendedcrafting:material:41>, <extendedcrafting:material:41>, <extendedcrafting:material:41>],
            [<extendedcrafting:material:41>, <extendedcrafting:material:41>, <extendedcrafting:material:41>],
            [<extendedcrafting:material:41>, <extendedcrafting:material:41>, <extendedcrafting:material:41>]
        ],
        <extendedcrafting:material:48>: [
            [<extendedcrafting:material:49>, <extendedcrafting:material:49>, <extendedcrafting:material:49>],
            [<extendedcrafting:material:49>, <extendedcrafting:material:49>, <extendedcrafting:material:49>],
            [<extendedcrafting:material:49>, <extendedcrafting:material:49>, <extendedcrafting:material:49>]
        ],
    } as IIngredient[][][IItemStack];

    for key, value in recipeMapShaped {
        recipes.addShaped(key, value);
    }

    var recipeMapShapeless = {
        <extendedcrafting:material> * 9: [<extendedcrafting:storage>],
        <extendedcrafting:material:7> * 9: [<extendedcrafting:storage:1>],
        <extendedcrafting:material:24> * 9: [<extendedcrafting:storage:3>],
        <extendedcrafting:material:32> * 9: [<extendedcrafting:storage:4>],
        <extendedcrafting:material:36> * 9: [<extendedcrafting:storage:5>],
        <extendedcrafting:material:40> * 9: [<extendedcrafting:storage:6>],
        <extendedcrafting:material:48> * 9: [<extendedcrafting:storage:7>]
    } as IIngredient[][IItemStack];

    for key, value in recipeMapShapeless {
        recipes.addShapeless(key, value);
    }
}