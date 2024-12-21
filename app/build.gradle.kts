plugins {
    application
    id("online.ravlinko.license")
}

application {
    applicationDefaultJvmArgs = listOf("-Dgreeting.language=en")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:32.1.1-jre")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.9.3")
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("online.ravlinko.App")
}
