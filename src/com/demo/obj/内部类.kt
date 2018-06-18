package com.demo.obj.a


/**
 * 内部类 和java的内部类是一样的 需要依赖外部类环境的对象
 */
fun main(args: Array<String>) {
    //创建内部类对象
    val innerClass = OutClass().InnerClass()

    innerClass.sayHello()
}


class OutClass {
    var name = "张三"

    inner class InnerClass {
        fun sayHello() {
            println("hello $name")
        }
    }
}