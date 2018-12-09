#priority 2000

import crafttweaker.item.IItemStack;

function init() {
    var removeItems as IItemStack[] = [

    ];

    for item in removeItems {
	    recipes.remove(item);
    }

    var removeRecipes as string[] = [

    ];

    for recipeRegex in removeRecipes {
	    recipes.removeByRegex(recipeRegex);
    }
}