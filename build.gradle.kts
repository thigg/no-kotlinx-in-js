plugins {
    kotlin("js") version "1.3.40"
}


repositories {
    jcenter()
}


kotlin {
    target {
        useCommonJs()
//        nodejs()
    }

    sourceSets["main"].dependencies {
        implementation(kotlin("stdlib-js"))
    }
}


val kotlinSourcesJar by tasks
