plugins {
    kotlin("jvm") version "1.3.11"
    id("voodoo") version "0.4.4-SNAPSHOT"
}

voodoo {
    addTask(name = "buildPack", parameters = listOf("build"))
    addTask(name = "server", parameters = listOf("pack server"))
    addTask(name = "testMmc", parameters = listOf("test mmc"))
    addTask(name = "testMmcClean", parameters = listOf("test mmc --clean"))
    addTask(name = "curse", parameters = listOf("pack curse"))
    addTask(name = "sk", parameters = listOf("pack sk"))
    addTask(name = "mmc", parameters = listOf("pack mmc"))
    addTask(name = "packAll", parameters = listOf("pack sk", "pack server", "pack mmc", "pack curse"))
    addTask(name = "buildAndPackAll", parameters = listOf("build", "pack sk", "pack server", "pack mmc", "pack curse"))
    addTask(name = "buildAndTestMmc", parameters = listOf("build", "test mmc"))
    addTask(name = "buildAndTestMmcClean", parameters = listOf("build", "test mmc --clean"))
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.11")
}