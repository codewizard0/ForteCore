#priority 2000

import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

function init() {
    var recipeMapShaped = {

    } as IIngredient[][][IItemStack];

    for key, value in recipeMapShaped {
        recipes.addShaped(key, value);
    }

    var recipeMapShapeless = {

    } as IIngredient[][IItemStack];

    for key, value in recipeMapShapeless {
        recipes.addShapeless(key, value);
    }
}