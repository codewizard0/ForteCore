import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addTech() {
    addBuildcraft()
    addThermal()
    addEnderIo()

    +Mod.eiorecipesteinductionsmelter

    addRfTools()
    //addImmersiveEngineering()
    //addMekanism()
    addMfr()

    +Mod.advancedGenerators
    //+Mod.calculator
    //+Mod.chargers
    +Mod.compactMachines
    +Mod.cyclic
    +Mod.draconicEvolution
    +Mod.environmentalTech
    +Mod.exchangers
    +Mod.extremeReactors
    +Mod.fluxNetworks
    +Mod.modularForcefieldSystem
    +Mod.solarFluxReborn
    +Mod.stevesCartsReborn
}

fun CurseListBuilder<CurseProvider>.addBuildcraft() {
    +Mod.additionalEnchantedMiner
    +Mod.additionalPipesForBuildcraft
    +Mod.buildcraft
}

fun CurseListBuilder<CurseProvider>.addMfr() {
    +Mod.industrialForegoing
    +Mod.integrationForegoing
}

fun CurseListBuilder<CurseProvider>.addThermal() {
    +Mod.thermalCultivation
    +Mod.thermalDynamics
    +Mod.thermalexpansion
    +Mod.thermalFoundation
    +Mod.thermalInnovation
}

fun CurseListBuilder<CurseProvider>.addEnderIo() {
    +Mod.enderIo
}

fun CurseListBuilder<CurseProvider>.addRfTools() {
    +Mod.rftools
    +Mod.rftoolsControl
    +Mod.rftoolsPower
}

fun CurseListBuilder<CurseProvider>.addImmersiveEngineering() {
    +Mod.immersiveCables
    +Mod.immersiveEngineering
    +Mod.immersivePetroleum
    +Mod.immersiveTech
}

fun CurseListBuilder<CurseProvider>.addMekanism() {
    +Mod.mekanism
    +Mod.mekanismGenerators
    +Mod.mekanismTools
}