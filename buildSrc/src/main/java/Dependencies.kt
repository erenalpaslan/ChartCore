/**
 * Created by erenalpaslan on 27.11.2022
 */
object BuildPlugins {
    const val android = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Deps {
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val core = "androidx.core:core-ktx:${Versions.core}"
}