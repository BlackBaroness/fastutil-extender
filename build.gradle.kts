plugins {
    `java-library`
    id("io.freefair.lombok") version "8.0.0-rc2" apply false
}

allprojects {
    group = "io.github.blackbaroness"
    version = "0.1.0"
}

subprojects {

    apply(plugin = "java-library")
    apply(plugin = "io.freefair.lombok")



    repositories {
        mavenCentral()
    }

    dependencies {
        compileOnly("org.jetbrains:annotations:24.0.1")
        compileOnly("org.checkerframework:checker-qual:3.32.0")

        testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    }

    tasks.named<Test>("test") {
        useJUnitPlatform()
    }
}
