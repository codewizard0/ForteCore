import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addMagic() {
    addBloodMagic()
    addBotania()
    addEmbers()
    addThaumcraft()
    +Mod.astralSorcery
    +Mod.astralSorcery
}

fun CurseListBuilder<CurseProvider>.addBloodMagic() {
    +Mod.animus
    +Mod.bloodArsenal
    +Mod.bloodMagic
    +Mod.tinkeringWithBloodMagic
}

fun CurseListBuilder<CurseProvider>.addBotania() {
    +Mod.botania
    +Mod.manatweaks
}

fun CurseListBuilder<CurseProvider>.addEmbers() {
    +Mod.embersRekindled
    +Mod.soot
    //+Mod.emberrootZoo
    //+Mod.roots
}

fun CurseListBuilder<CurseProvider>.addThaumcraft() {
    +Mod.engineeredGolems
    +Mod.expandedArcanum
    +Mod.thaumcraft
    +Mod.thaumcraftInventoryScanning
    +Mod.thaumicAdditions
    +Mod.thaumicEnergistics
    +Mod.thaumicGadgets
    +Mod.thaumicPeriphery
    +Mod.thaumicTerminal
    +Mod.thaumicTinkerer
}