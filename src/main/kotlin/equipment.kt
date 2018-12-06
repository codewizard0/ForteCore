import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addEquipment() {
    +Mod.baubleyHeartCanisters
    +Mod.redstoneRepositoryRevolved

    //addConstructsArmory()
    addTinkers()
    +Mod.yoyos
    //addSilents()
}

fun CurseListBuilder<CurseProvider>.addTinkers() {
    //+Mod.pewter
    //+Mod.tinkerstages

    +Mod.ceramics
    +Mod.natura
    +Mod.plustic
    +Mod.tinkersAddons
    +Mod.tinkersComplement
    +Mod.tinkersConstruct
    +Mod.tinkersToolLeveling
    +Mod.zenFoundry
}

fun CurseListBuilder<CurseProvider>.addConstructsArmory() {
    +Mod.armoryExpansion
    +Mod.constructsArmory
}

fun CurseListBuilder<CurseProvider>.addSilents() {
    +Mod.silentsGems
    +Mod.silentsGemsExtraParts
    //+Mod.silentsGemsTicSupport
}