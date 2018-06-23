plugins {
    application

    kotlin("jvm") version "1.2.50"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

//主类名必须 带kt
application{
    mainClassName="MainKt"
}