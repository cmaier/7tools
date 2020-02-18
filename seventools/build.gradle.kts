import com.android.build.gradle.BaseExtension

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.github.dcendents.android-maven")
}

group = "com.github.cmaier"

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(19)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.fragment:fragment:1.2.1")
    testImplementation("junit:junit:4.13")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2") {
        exclude(group = "com.android.support", module = "support-annotations")
    }
    testImplementation("io.kotlintest:kotlintest:2.0.7")
}

tasks {
    val sourcesJar = register<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(project.the<BaseExtension>().sourceSets["main"].java.srcDirs)
    }
    artifacts { add("archives", sourcesJar) }
}
