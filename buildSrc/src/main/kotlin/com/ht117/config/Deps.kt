package com.ht117.config

object Deps {

    object Kt {
        const val serialize = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:2.1.2"
    }

    object Androidx {
        const val core = "androidx.core:core-ktx:1.9.0"
        const val appCompat = "androidx.appcompat:appcompat:1.5.1"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val material = "com.google.android.material:material:1.6.1"
        const val navFragment = "androidx.navigation:navigation-fragment-ktx:2.5.2"
        const val navUIKtx = "androidx.navigation:navigation-ui-ktx:2.5.2"

        const val roomRuntime = "androidx.room:room-runtime:2.4.3"
        const val roomCompiler = "androidx.room:room-compiler:2.4.3"
        const val roomKt = "androidx.room:room-ktx:2.4.3"
    }

    object Common {
        const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.9.1"
    }

    object Koin {
        const val core = "io.insert-koin:koin-core:3.2.2"
        const val android = "io.insert-koin:koin-android:3.2.3"
    }

    object Network {
        const val Retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val Logger = "com.squareup.okhttp3:logging-interceptor:4.9.0"
//        const val Converter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.5.0"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val extJunit = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    }
}