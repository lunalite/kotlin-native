import org.jetbrains.kotlin.cli.jvm.main

plugins {
    kotlin("multiplatform") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm("jvm") {}

    macosX64("macos") {
        binaries {
            executable {
                entryPoint = "org.example.main"
                runTask?.standardInput = System.`in`
            }
        }
    }
//    macosX64("native") {
//        binaries {
//            executable()
//        }
//    }

}
