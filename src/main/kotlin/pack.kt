import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider

fun CurseListBuilder<CurseProvider>.buildPack() {
    addClient()
    //addDecoration()
    //addEquipment()
    addGeneral()
    //addLogic()
    //addMagic()
    addPackUtils()
    //addResource()
    addServer()
    addStorage()
    //addTech()
    //addWorld()
}