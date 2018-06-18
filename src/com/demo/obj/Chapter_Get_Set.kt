package com.demo.obj

/**
 * Kotlin字段是私有的 会自动生成get和set方法
 */
fun main(args: Array<String>) {
    val p = Person1()
    println(p.name)
    p.age = 30
    println(p.age)
}


class Person1 {
    var name = "张三"//如果只能访问但是不能修改
        private set //私有set方法
    var age = 20
        set(value) {
            if (value < 150) {
//                this.age = value //当age小于150的时候会死循环 一直setAge
                field = value //field字段表示当前字段
            }
        }
}