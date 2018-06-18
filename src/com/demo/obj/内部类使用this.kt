package com.demo.obj.b


/**
 * 内部类 使用this
 */
fun main(args: Array<String>) {
    //创建内部类对象
    val innerClass = OutClass().InnerClass()

    innerClass.sayHello()
}


class OutClass {
    var name = "张三"

    inner class InnerClass {
        var name = "李四"
        fun sayHello() {
            println("hello OutClass  name = ${this@OutClass.name}")
            println("hello InnerClass name = ${this.name}")
        }
    }
}