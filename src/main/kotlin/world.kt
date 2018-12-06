import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addWorld() {
    addDimensions()
}

fun CurseListBuilder<CurseProvider>.addDimensions() {
    +Mod.rftoolsDimensions
    +Mod.mystcraft
    +Mod.theLostCities
    +Mod.theTwilightForest
    +Mod.dimensionaldoors
    +Mod.aroma1997sDimensionalWorld
    +Mod.randomThings
    +Mod.huntingDimension
}