plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply(plugin = "maven-publish")

android {
    namespace = "com.github.ChartCore"
    compileSdk = 33

    defaultConfig {
        minSdk = 19
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {
    implementation(Deps.gson)
    implementation(Deps.core)
}

afterEvaluate {
    configure<PublishingExtension> {
        val artifact = "chartcore"
        val publishedGroupId = "com.github.charts"
        val libraryName = "ChartCore-Kotlin"

        publications {
            create<MavenPublication>("maven") {
                groupId = publishedGroupId
                artifactId = artifact
                version = "1.0.0"

                pom {
                    packaging = "aar"
                    name.set(libraryName)
                    description.set("ChartCore-Kotlin library")
                    developers {
                        developer {
                            id.set("ErenAlpaslan")
                            name.set("Eren Alpaslan")
                            email.set("erenalpaslan@gmail.com")
                            url.set("https://github.com/ErenAlpaslan")
                        }
                    }
                    scm {
                        connection.set("scm:git:github.com/ErenAlpaslan/ChartCore.git")
                        developerConnection.set("scm:git:ssh://github.com/ErenAlpaslan/ChartCore.git")
                        url.set("https://github.com/ErenAlpaslan/ChartCore/tree/master")
                    }
                    /*withXml {
                        val dependenciesNode = asNode().appendNode("dependencies")
                        configurations.getByName("implementation") {
                            dependencies.forEach {
                                val dependencyNode = dependenciesNode.appendNode("dependency")
                                dependencyNode.appendNode("groupId", it.group)
                                dependencyNode.appendNode("artifactId", it.name)
                                dependencyNode.appendNode("version", it.version)
                            }
                        }
                    }*/
                }
                afterEvaluate {
                    from(components["release"])
                }
            }

        }
    }
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
}