plugins {
    id("buildlogic.plugins.application")
}

android {
    namespace = "com.simtop.bragdoc.android"
    defaultConfig {
        applicationId = "com.simtop.bragdoc.android"
        versionCode = 1
        versionName = "1.0"

        resValue("string", "app_name_label", "BragDoc")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }

        getByName("debug") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(projects.shared)

    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.android.material)
}