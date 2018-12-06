import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addGeneral() {
    addFix()
    addUtils()
    addLibs()
    //addSemiTech()
    addTools()

    //+Mod.corailTombstone
    //+Mod.enchantingPlus
    +Mod.engineersWorkshopReborn
    +Mod.extraUtilities
    //+Mod.inspirations
    +Mod.openblocks
    //+Mod.quark
    +Mod.translocators18
}

fun CurseListBuilder<CurseProvider>.addSemiTech() {
    +Mod.portalGun
    +Mod.reliquaryV13
    +Mod.actuallyAdditions
    +Mod.tinyProgressions
}

fun CurseListBuilder<CurseProvider>.addTools() {
    //+Mod.buildingGadgets
    +Mod.betterBuildersWands
    //+Mod.meecreeps

    +Mod.akashicTome
    +Mod.morphOTool
}

fun CurseListBuilder<CurseProvider>.addUtils() {
    +Mod.carryOn
    +Mod.oreExcavation
    +Mod.twerkSim2k16

    +Mod.ftbUtilities
    //+Mod.inGameWikiMod
    //+Mod.antighost
    +Mod.jei
}

fun CurseListBuilder<CurseProvider>.addLibs() {
    +Mod.reborncore
    +Mod.shadowfactsForgelin
}

fun CurseListBuilder<CurseProvider>.addFix() {
    +Mod.itemphysic
    //+Mod.uppers
    //+Mod.kleeslabs
    +Mod.quickLeafDecay
    //+Mod.forgivingVoid
    +Mod.unidict
    //+Mod.structureutils
    +Mod.attributefix
    +Mod.jeid
    +Mod.stackie
    +Mod.vanillafix
    //+Mod.foamfixForMinecraft
    +Mod.betterfps
    //+Mod.fastfurnace
    //+Mod.fastworkbench
    //+Mod.dietHoppers
    //+Mod.realbench
    //+Mod.fenceOverhaul
    +Mod.fenceJumper
    //+Mod.commonCapabilities
}
