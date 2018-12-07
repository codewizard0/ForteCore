import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addStorage() {
    +Mod.simpleStorageNetwork
    //+Mod.enderRift

    +Mod.bibliocraft
    +Mod.ironChests
    +Mod.storageDrawers
    +Mod.enderStorage18
    //+Mod.yabba
    //+Mod.realFilingCabinet
    +Mod.dankNull

    ///+Mod.ironTanks

    //addAppliedEnergistics()
    //addRefinedStorage()
    addBackpacks()
}

fun CurseListBuilder<CurseProvider>.addBackpacks() {
    +Mod.ironBackpacks
    //+Mod.forgeBackpacks
    //+Mod.v0idsSmartBackpacks
    //+Mod.compactstorage
}

fun CurseListBuilder<CurseProvider>.addAppliedEnergistics() {
    +Mod.appliedEnergistics2
    +Mod.extracells2
    +Mod.ae2Stuff
    +Mod.wirelessCraftingTerminal
    +Mod.spatialcompat
    +Mod.packagedAuto
}

fun CurseListBuilder<CurseProvider>.addRefinedStorage() {
    +Mod.refinedStorage
    +Mod.refinedStorageAddons
    +Mod.rebornstorage
}