#priority 2000

import crafttweaker.item.IItemStack;

function init() {
    //Must be item not oreDict
    val removeAndHideItems as IItemStack[] = [
        <base:wrench>
    ];

    for item in removeAndHideItems {
	    mods.jei.JEI.removeAndHide(item);
    }
}