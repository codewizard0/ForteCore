import voodoo.data.UserFiles
import voodoo.data.curse.FileType
import voodoo.dsl.builder.ModpackBuilder
import voodoo.provider.CurseProvider
import voodoo.withDefaultMain

fun main(vararg args: String) = withDefaultMain(
        root = Constants.rootDir,
        arguments = args
) {
    nestedPack(
            id = "fortecore",
            mcVersion = "1.12.2"
    ) {
        buildPack()
    }
}

fun ModpackBuilder.buildPack() {
    title = "Liquid Forte Modpack"
    authors = listOf("eric")
    version = "0.0.0-SNAPSHOT"
    forge = Forge.mc1_12_2_latest
    sourceDir = ".minecraft"
    localDir = "local"
    userFiles = UserFiles(
            include = listOf(""),
            exclude = listOf("")
    )
    root = rootEntry(CurseProvider) {
        validMcVersions = setOf("1.12.1", "1.12")
        releaseTypes = setOf(FileType.RELEASE, FileType.BETA, FileType.ALPHA)
        list {
            buildPack()
        }
    }
}
