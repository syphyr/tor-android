pluginManagement {
    repositories {
        maven { url = uri("/media/delta/T5/android/orbot-latest/maven") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url = uri("/media/delta/T5/android/orbot-latest/maven") }
        google()
        mavenCentral()
        maven(uri("https://raw.githubusercontent.com/guardianproject/gpmaven/master"))
    }
}

include(":tor-android-binary", ":sampletorapp")
