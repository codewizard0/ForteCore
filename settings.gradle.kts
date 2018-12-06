pluginManagement {
    repositories {
        mavenCentral()
        jcenter()
        maven(url = "https://kotlin.bintray.com/kotlinx") { name = "KotlinX" }
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap") { name = "kotlin-eap" }
        maven(url = "https://jitpack.io") { name = "jitpack" }
        maven(url = "https://repo.elytradev.com") { name = "elytradev" }
        gradlePluginPortal()
    }
}

rootProject.name = "ForteCore"
