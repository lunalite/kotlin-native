plugins {
    kotlin("multiplatform") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm("jvm") {

    }

    macosX64("macos") {
        binaries {
            executable {
                entryPoint = "org.example.main"
                runTask?.standardInput = System.`in`
            }
        }
    }

}

tasks {
    withType<JavaExec> {
        standardInput = System.`in`
    }
}
