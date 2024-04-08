// Ensure you're using this in settings.gradle.kts, not in build.gradle.kts
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

// This block can stay in settings.gradle.kts if needed
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        // Only add jcenter() if your project really needs it
        // jcenter()
    }
}

rootProject.name = "Navigation"
include(":app")
 