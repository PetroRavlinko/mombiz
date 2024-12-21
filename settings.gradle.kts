plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "mombiz"
include("app")
include("codereview")

includeBuild("gradle/license-plugin") 