plugins {
    `java-library`
    `maven-publish`
    signing
    id("io.freefair.lombok") version "8.0.1" apply false
}

allprojects {
    group = "io.github.blackbaroness"
    version = "1.2.0"
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

    java {
        val javaVersion = JavaVersion.VERSION_1_8
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
        withJavadocJar()
        withSourcesJar()
    }

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
                pom {
                    name.set(project.name)
                    description.set(project.name)
                    url.set("https://github.com/BlackBaroness/fastutil-extender")
                    developers {
                        developer {
                            id.set("blackbaroness")
                            name.set("BlackBaroness")
                            email.set("shoyurash2@gmail.com")
                        }
                    }
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

    tasks {
        javadoc {
            options.encoding = "UTF-8"
            if (JavaVersion.current().isJava9Compatible) {
                (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
            }
        }

        test {
            useJUnitPlatform()
        }

        withType<JavaCompile> {
            options.encoding = "UTF-8"
        }
    }
}
