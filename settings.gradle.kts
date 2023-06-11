pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "SkydomMC-Server"

include("SkydomMC-API", "SkydomMC-Server")
