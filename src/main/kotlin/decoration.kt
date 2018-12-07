import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addDecoration() {
    +Mod.chisel
    //+Mod.traverse

    //+Mod.dynamictrees
    //+Mod.dynamicTreesTraverseCompat

    //+Mod.betterFoliage

    +Mod.chiselsBits
    +Mod.extraBitManipulation
    +Mod.flatColoredBlocks

    +Mod.malisisdoors
}