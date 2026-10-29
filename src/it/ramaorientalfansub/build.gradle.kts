plugins {
    id("com.android.application")
    id("kotlin-android")
}

ext {
    val extName = "RaMa Oriental Fansub Private"
    val extClass = ".RamaOrientalFansub"
    val extVersionCode = 1
    val libVersion = "1.4"
}

dependencies {
    implementation(project(":multisrc:madara"))
}

apply(from = "$rootDir/common.gradle")
