import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.50"
}

group = "com.mth.demo"
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
//任务集合  任务生命周期分为 扫描 或者 执行  扫描的时候会默认执行task的闭包，如果不想执行
//可以通过doFirst或者doLast来避免

tasks {
    "a"{
        group = "任务分组"
        doFirst {
            println("aaaaaaaaaaaaa")
        }
    }

    "b"{
        group = "任务分组"
        doFirst {
            println("bbbbbbbbb")
        }
    }

    "c"{
        group = "任务分组"
        doFirst {
            println("ccccccccc")
        }
    }.dependsOn("a").dependsOn("b")

}

project.properties.forEach {
    println("it.key =${it.key}  it.value=${it.value}")
}

