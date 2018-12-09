import voodoo.data.Side
import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addClient() {
    group {
        side = Side.CLIENT
    }.list {
        //+Mod.antighost
        +Mod.appleskin
        +Mod.aromabackup
        +Mod.betterAdvancements
        //+Mod.clientTweaks
        +Mod.controlling
        +Mod.craftingTweaks
        //+Mod.ding
        //+Mod.fancyBlockParticles
        +Mod.inventoryTweaks
        //+Mod.itemzoom
        +Mod.jeiIntegration
        +Mod.journeymap
        //+Mod.justEnoughResourcesJer
        //+Mod.justthetips
        //+Mod.keyboardWizard
        +Mod.moreOverlays
        +Mod.mouseTweaks
        //+Mod.neat
        +Mod.noRecipeBook
        //+Mod.notEnoughItems18
        //+Mod.proportionalDestructionParticles
        //+Mod.toastControl
        //+Mod.wailaHarvestability
        +Mod.wawlaWhatAreWeLookingAt
        +Mod.hwyla
    }
}