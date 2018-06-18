package com.demo.obj

/**
 * Kotlin字段是私有的 会自动生成get和set方法
 */
fun main(args: Array<String>) {
    val p = Person()
    println(p.name)
    println(p.age)
}


class Person {
    var name = "张三"//如果只能访问但是不能修改
        private set //私有set方法
    var age = 20
}