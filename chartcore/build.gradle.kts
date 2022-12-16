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

                artifact(tasks.getByName("sourcesJar"))

                pom {
                    packaging = "aar"
                    name.set(libraryName)
                    description.set("ChartCore-Kotlin library")
                    withXml {
                        val dependenciesNode = asNode().appendNode("dependencies")
                        configurations.getByName("implementation") {
                            dependencies.forEach {
                                val dependencyNode = dependenciesNode.appendNode("dependency")
                                dependencyNode.appendNode("groupId", it.group)
                                dependencyNode.appendNode("artifactId", it.name)
                                dependencyNode.appendNode("version", it.version)
                            }
                        }
                    }
                }
            }
        }

        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/ErenAlpaslan/ChartCore")
                credentials {
                    username = System.getenv("GPR_USER")
                    password = System.getenv("GPR_KEY")
                }
            }
        }
    }
}
tasks.withType<PublishToMavenRepository> {
    dependsOn("assemble")
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
}