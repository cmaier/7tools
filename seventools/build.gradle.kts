import com.android.build.gradle.BaseExtension

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.github.dcendents.android-maven")
    id("de.mannodermaus.android-junit5")
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
        testInstrumentationRunnerArgument("runnerBuilder", "de.mannodermaus.junit5.AndroidJUnit5Builder")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    packagingOptions {
        exclude("META-INF/LICENSE*")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.4.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.fragment:fragment-ktx:1.2.5")

    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2") {
        exclude(group = "com.android.support", module = "support-annotations")
    }
    androidTestImplementation("androidx.test:runner:1.3.0")
    androidTestImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    androidTestImplementation("de.mannodermaus.junit5:android-test-core:1.2.0")
    androidTestRuntimeOnly("de.mannodermaus.junit5:android-test-runner:1.2.0")
    testImplementation("io.kotest:kotest-runner-junit5:4.2.2")
    testImplementation("io.kotest:kotest-assertions-core:4.2.2")
    testImplementation("io.kotest:kotest-property:4.2.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks {
    val sourcesJar = register<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(project.the<BaseExtension>().sourceSets["main"].java.srcDirs)
    }
    artifacts { add("archives", sourcesJar) }
}
