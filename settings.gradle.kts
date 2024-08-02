pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }

    versionCatalogs {
        create("libs") {
            version("room", "2.6.0")
            version("hilt", "2.50")
            version("coroutines", "1.3.9")
            library("retrofit","com.squareup.retrofit2:retrofit:2.9.0")
            library("retrofit-gson","com.squareup.retrofit2:converter-gson:2.7.2")
            library("kotlin-stdlib", "org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
            library("kotlin-coroutines", "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
            library("androidx-core", "androidx.core:core-ktx:1.9.0")
            library("androidx-appcompat", "androidx.appcompat:appcompat:1.6.0")
            library("androidx-material", "com.google.android.material:material:1.7.0")
            library("androidx-lifecycle-runtime", "androidx.lifecycle:lifecycle-runtime-ktx:2.6.0")
            library("androidx-activity-compose", "androidx.activity:activity-compose:1.8.2")
            library("kotlin-coroutines-android", "org.jetbrains.kotlinx","kotlinx-coroutines-android").versionRef("coroutines")
            library("kotlin-coroutines-test", "org.jetbrains.kotlinx","kotlinx-coroutines-test").versionRef("coroutines")
            library("hilt", "com.google.dagger","hilt-android").versionRef("hilt")
            library("hilt-compiler", "com.google.dagger","hilt-android-compiler").versionRef("hilt")
            library("androidx-compose-bom", "androidx.compose:compose-bom:2023.08.00")
            library("room-runtime","androidx.room","room-runtime").versionRef("room")
            library("room-compiler","androidx.room","room-compiler").versionRef("room")
            library("room-ktx","androidx.room","room-ktx").versionRef("room")
            library("junit", "junit:junit:4.13.2")
            library("androidx-test", "androidx.test.ext:junit:1.1.5")
            library("androidx-test-espresso", "androidx.test.espresso:espresso-core:3.5.1")
        }
    }
}

rootProject.name = "Android Project Template"
include(":app", ":ui", ":data")
