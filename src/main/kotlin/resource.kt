import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addResource() {
    +Mod.darkUtilities
    +Mod.mobGrindingUtils

    +Mod.bonsaiTrees
    +Mod.enderCrop
    +Mod.karatGarden

    //+Mod.waterStrainer

    //addAgricraft()
    addBees()
    //addMysticalAgriculture()
    //addProjectE()
}

fun CurseListBuilder<CurseProvider>.addAgricraft() {
    +Mod.agricraft
    +Mod.multifarmCrops
}

fun CurseListBuilder<CurseProvider>.addFood() {
    +Mod.farmingForBlockheads
    +Mod.cookingForBlockheads
    +Mod.pamsHarvestcraft
}

fun CurseListBuilder<CurseProvider>.addBees() {
    +Mod.forestry
    +Mod.magicBees
    +Mod.binniesMods
    +Mod.gendustry
    +Mod.careerBees
}

fun CurseListBuilder<CurseProvider>.addMysticalAgriculture() {
    +Mod.mysticalAgriculture
    +Mod.mysticalAgradditions
    +Mod.mysticalAgricultureTieredCrystals
    +Mod.mystagradClocheCompat
}

fun CurseListBuilder<CurseProvider>.addProjectE() {
    +Mod.projecte
    +Mod.equivalentEnergistics
    +Mod.equivalentAdditions
    +Mod.equivalentIntegrations
}