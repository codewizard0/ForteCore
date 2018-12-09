#priority 2000

function init() {
    //Remove and Hide Recipes
    var modIDs as string[] = [

    ];

    for id in modIDs {
	    for item in loadedMods[id].items {
		    mods.jei.JEI.removeAndHide(item);
	    }
    }

    //Remove Recipes Only
    var modIDs2 as string[] = [

    ];

    for id in modIDs2 {
	    for item in loadedMods[id].items {
		    recipes.remove(item);
	    }
    }
}