import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addPackUtils() {
    +Mod.caliper
    +Mod.mputils
    +Mod.mputilsBasicTools
    +Mod.laggoggles
    +Mod.defaultOptions

    //+Mod.villagerTradeTables

    addAdvancements()
    addTweaker()
    addCrafting()
    addStages()
    //addWorldCustomization()
    addLoot()

    addMakerTools()
}

fun CurseListBuilder<CurseProvider>.addMakerTools() {
    +Mod.externalTweaker
}

fun CurseListBuilder<CurseProvider>.addWorldCustomization() {
    +Mod.topography
    +Mod.biometweaker
}

fun CurseListBuilder<CurseProvider>.addAdvancements() {
    +Mod.triumph
    +Mod.prestige
    //+Mod.scavengePrestige
}

fun CurseListBuilder<CurseProvider>.addTweaker() {
    +Mod.inControl
    +Mod.crafttweaker
    +Mod.modtweaker
    +Mod.contenttweaker
    +Mod.packmode
    +Mod.initialInventory
}

fun CurseListBuilder<CurseProvider>.addCrafting() {
    +Mod.extendedCrafting
    //+Mod.moreplates
    //+Mod.researchTable
    //+Mod.modularMachinery
    //+Mod.modularDiversity
    //+Mod.avaritia110
    //+Mod.avaritiaddons
    //+Mod.biggerCraftingTables
    //+Mod.artisanWorktables
}

fun CurseListBuilder<CurseProvider>.addStages() {
    //+Mod.scavengeGamestages
    //+Mod.scavengeBaubles

    +Mod.togetherForever
    +Mod.zenstages
    +Mod.gameStages
    +Mod.itemStages
    +Mod.mobStages
    +Mod.dimensionStages
    +Mod.oreStages
    +Mod.recipeStages
    +Mod.timeStages
    //+Mod.multiblockStages
}

fun CurseListBuilder<CurseProvider>.addLoot() {
    +Mod.additionalLootTables
    +Mod.loottabletweaker
    +Mod.jsonLootBags
    +Mod.progressiveBoxes
}