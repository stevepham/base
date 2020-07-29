plugins {
    id(Deps.Plugins.Library)
    id(Deps.Plugins.KotlinAndroid)
    id(Deps.Plugins.KotlinExt)
}

android {
    compileSdkVersion(Deps.App.compileSdk)
    buildToolsVersion(Deps.App.buildTools)

    defaultConfig {
        minSdkVersion(Deps.App.minSdk)
        targetSdkVersion(Deps.App.targetSdk)
        versionCode = Deps.App.VersionCode
        versionName = Deps.App.VersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree(Deps.Common.FileTree))

    api(Deps.Kt.StdLib)
    api(Deps.Androidx.CoreKtx)
    api(Deps.Androidx.AppCompat)
    api(project(":domain"))

    testImplementation(Deps.Test.JUnit4)
    androidTestImplementation(Deps.Test.ExtJunit)
    androidTestImplementation(Deps.Test.Espresso)

}