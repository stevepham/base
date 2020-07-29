object Deps {
    object Plugins {
        const val BuildGradle = "com.android.tools.build:gradle:${Version.buildGradle}"
        const val BuildKotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kt}"
        const val Application = "com.android.application"
        const val Library = "com.android.library"
        const val KotlinAndroid = "kotlin-android"
        const val KotlinExt = "kotlin-android-extensions"
        const val JavaLib = "java-library"
        const val Kotlin = "kotlin"
    }

    object App {
        const val minSdk = 23
        const val compileSdk = 29
        const val targetSdk = 29
        const val buildTools = "29.0.3"
        const val VersionCode = 1
        const val VersionName = "1.0"
    }

    object Kt {
        const val StdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kt}"
        const val StdJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kt}"
    }

    object Androidx {
        const val CoreKtx = "androidx.core:core-ktx:${Version.KtxCore}"
        const val AppCompat = "androidx.appcompat:appcompat:${Version.AppCompat}"
        const val Constraint = "androidx.constraintlayout:constraintlayout:${Version.Constraint}"
        const val NavFragment = "androidx.navigation:navigation-fragment-ktx:${Version.NavFragment}"
        const val NavUiKtx = "androidx.navigation:navigation-ui-ktx:${Version.NavUiKtx}"
    }

    object Common {
        val FileTree = mapOf("dir" to "libs", "include" to listOf("*.jar"))
        const val Koin = "org.koin:koin-core:${Version.Koin}"
        const val KoinScope = "org.koin:koin-androidx-scope:${Version.Koin}"
        const val KoinVm = "org.koin:koin-androidx-viewmodel:${Version.Koin}"
        const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:${Version.LeakCanary}"
    }

    object Network {
        const val Retrofit = "com.squareup.retrofit2:retrofit:${Version.Retrofit}"
        const val Moshi = "com.squareup.moshi:moshi:${Version.Moshi}"
        const val MoshiGen = "com.squareup.moshi:moshi-kotlin-codegen:${Version.Moshi}"
        const val Logger = "com.squareup.okhttp3:logging-interceptor:${Version.Interceptor}"
    }

    object Test {
        const val JUnit4 = "junit:junit:${Version.Junit}"
        const val ExtJunit = "androidx.test.ext:junit:${Version.ExtJunit}"
        const val Espresso = "androidx.test.espresso:espresso-core:${Version.Espresso}"
        const val Koin = "org.koin:koin-test:${Version.Koin}"
    }
}