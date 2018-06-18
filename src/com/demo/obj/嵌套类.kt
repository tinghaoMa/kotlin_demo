package com.demo.obj

/**
 * 嵌套类 是属于静态类 跟外部类没有关系 数据互不可见
 */
fun main(args: Array<String>) {
    //创建嵌套类对象
    val innerClass = OutClass.InnerClass()

    innerClass.sayHello()

}


class OutClass {
    var name = "张三"

    class InnerClass {
        fun sayHello() {
//            println("hello $name") //访问不到
        }
    }
}