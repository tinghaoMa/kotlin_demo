import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.50"
    application
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

//把所有的文件名写入到info.txt

//增量更新必须指定输入源和输出源   inputs.dir()  inputs.file()  outputs.dir()  outputs.file()

task("myCopy") {
    group ="mth"

    inputs.dir("src")
    outputs.file("info.txt")

    doFirst {
        val file = fileTree("src")
        val info = File("info.txt")
        if(info.exists()){
            info.delete()
            info.createNewFile()
        }
        file.forEach {
            Thread.sleep(1000)
            if(it.isFile){
                info.appendText(it.name)
                info.appendText("\n")
            }
        }
    }

}