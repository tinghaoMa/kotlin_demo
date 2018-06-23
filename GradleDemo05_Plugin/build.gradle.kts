import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.50"
    application
//    id ("org.gradle.kotlin.kotlin-dsl") version ("0.18.2")
}

group = "com.mth.gradle"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}



//buildscript {
//    repositories {
//        maven {
//            setUrl("https://plugins.gradle.org/m2/")
//        }
//    }
//    dependencies {
//        classpath("gradle.plugin.org.gradle.kotlin:gradle-kotlin-dsl-plugins:0.18.2")
//    }
//}
////apply plugin : "org.gradle.kotlin.kotlin-dsl"
//
//apply{
//    plugin("org.gradle.kotlin.kotlin-dsl")
//}

