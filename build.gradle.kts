plugins {
    `java-library`
    `maven-publish`
    signing
    id("io.freefair.lombok") version "8.0.0-rc2" apply false
}

allprojects {
    group = "io.github.blackbaroness"
    version = "0.1.0-SNAPSHOT"
}

subprojects {

    apply(plugin = "java-library")
    apply(plugin = "maven-publish")
    apply(plugin = "signing")
    apply(plugin = "io.freefair.lombok")

    repositories {
        mavenCentral()
    }

    dependencies {
        compileOnly("org.jetbrains:annotations:24.0.1")
        compileOnly("org.checkerframework:checker-qual:3.32.0")

        testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    }

    tasks.named<Test>("test") {
        useJUnitPlatform()
    }

    java {
        withJavadocJar()
        withSourcesJar()
    }

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
                pom {
                    licenses {
                        license {
                            name.set("The MIT License")
                            url.set("https://opensource.org/license/mit/")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com/BlackBaroness/fastutil-extender.git")
                        developerConnection.set("scm:git:ssh://github.com/BlackBaroness/fastutil-extender.git")
                        url.set("https://github.com/BlackBaroness/fastutil-extender")
                    }
                }
            }
        }
        repositories {
            maven {
                val releasesRepoUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
                val snapshotsRepoUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
                url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl

                credentials {
                    username = System.getProperty("ossrhUsername")
                    password = System.getProperty("ossrhPassword")
                }
            }
        }
    }

    signing {
        sign(publishing.publications["mavenJava"])
    }

    tasks.javadoc {
        if (JavaVersion.current().isJava9Compatible) {
            (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
        }
    }
}
