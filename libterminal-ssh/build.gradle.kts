plugins {
    alias(libs.plugins.androidLibrary)
}

android {
    namespace = "com.awkoo.libterminal.ssh"

    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 28
    }
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(project(":libterminal"))
    implementation(libs.kotlinx.coroutines.android)
}
