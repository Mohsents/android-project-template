/**
 * Define libraries dependencies.
 */
object Dependencies {

    object Plugins {
        const val AGP = "com.android.tools.build:gradle:${Versions.AGP}"
        const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        const val HILT = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
    }

    object Libs {
        const val ANNOTATION = "androidx.annotation:annotation:${Versions.ANNOTATION}"
        const val SUPPORT_LIBRARY = "androidx.appcompat:appcompat:${Versions.SUPPORT_LIBRARY}"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val APP_INTRO = "com.github.AppIntro:AppIntro:${Versions.APP_INTRO}"
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_GSON_CONVERTER =
            "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_GSON_CONVERTER}"
        const val ANDROIDX_SECURITY =
            "androidx.security:security-crypto:${Versions.ANDROIDX_SECURITY}"
        const val BALLOON = "com.github.skydoves:balloon:${Versions.BALLOON}"
        const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
        const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
        const val DATASTORE = "androidx.datastore:datastore-preferences:${Versions.DATASTORE}"
        const val SWIPE_REFRESH_LAYOUT =
            "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SWIPE_REFRESH_LAYOUT}"
        const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"
        const val LIFECYCLE_PROCESS = "androidx.lifecycle:lifecycle-process:${Versions.LIFECYCLE}"
        const val LEGACY_SUPPORT = "androidx.legacy:legacy-support-v4:${Versions.LEGACY_SUPPORT}"
        const val PREFERENCES_KTX = "androidx.preference:preference-ktx:${Versions.PREFERENCES_KTX}"
        const val APPACHE_COMMONS_IO = "commons-io:commons-io:${Versions.APPACHE_COMMONS_IO}"
        const val COMPRESSOR = "id.zelory:compressor:${Versions.COMPRESSOR}"
        const val LEAKCANARY = "com.squareup.leakcanary:leakcanary-android:${Versions.LEAKCANARY}"
        const val VIEWBINDING_PROPERTY_DELEGATE =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.VIEWBINDING_PROPERTY_DELEGATE}"
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"
        const val NAVIGATION = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
        const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
        const val LIFECYCLE_VIEW_MODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
        const val LIFECYCLE_LIVEDATA =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
        const val LIFECYCLE_COMMON_JAVA8 =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.LIFECYCLE}"
        const val LIFECYCLE_RUNTIME =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
        const val COROUTINE_ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
        const val COROUTINE_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
        const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_NAVIGATION =
            "androidx.hilt:hilt-navigation-fragment:${Versions.HILT_NAVIGATION}"
        const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
        const val HILT_ANDROID_TESTING = "com.google.dagger:hilt-android-testing:${Versions.HILT}"
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val ANDROIDX_JUNIT = "androidx.test.ext:junit-ktx:${Versions.ANDROIDX_JUNIT}"
        const val HAMCREST = "org.hamcrest:hamcrest-all:${Versions.HAMCREST}"
        const val ROBOLECTRIC = "org.robolectric:robolectric:${Versions.ROBOLECTRIC}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
        const val ANDROIDX_RULES = "androidx.test:rules:${Versions.RULES}"
        const val ARCH_CORE_TESTING = "androidx.arch.core:core-testing:${Versions.ARCHITECTURE}"
        const val CORE_KTX_TESTING = "androidx.test:core-ktx:${Versions.ANDROIDX_TEST}"
        const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
        const val ESPRESSO_INTENTS = "androidx.test.espresso:espresso-intents:${Versions.ESPRESSO}"
    }
}