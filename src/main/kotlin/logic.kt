import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addLogic() {
    +Mod.extraRails
    +Mod.funkyLocomotion
    +Mod.openentity
    +Mod.redstoneplusplus
    +Mod.signals
    +Mod.tinkersMechworksFork
    +Mod.wirelessRedstoneCbe

    addProjectRed()
    addComputers()
    addLogistics()
}

fun CurseListBuilder<CurseProvider>.addProjectRed() {
    +Mod.projectRedBase
    +Mod.projectRedCompat
    +Mod.projectRedFabrication
    +Mod.projectRedIntegration
    +Mod.projectRedLighting
    +Mod.projectRedMechanical
    +Mod.projectRedWorld
}

fun CurseListBuilder<CurseProvider>.addComputers() {
    +Mod.ccTweaked
    +Mod.opencomputers
}

fun CurseListBuilder<CurseProvider>.addLogistics() {
    +Mod.inductiveLogistics
    +Mod.integratedDynamics
    +Mod.integratedTunnels
    +Mod.practicalLogistics2
    +Mod.superFactoryManager
    +Mod.xnet
    +Mod.ynot
}