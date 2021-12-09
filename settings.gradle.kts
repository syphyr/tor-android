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

include(":tor-android-binary", ":sampletorapp")
