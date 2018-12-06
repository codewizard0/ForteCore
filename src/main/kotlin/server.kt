import voodoo.data.Side
import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.addServer() {
    group {
        side = Side.SERVER
    }.list {
        +Mod.btfuContinuousRsyncIncrementalBackup
        +Mod.colorchat
        +Mod.morpheus
    }
}