package com.demo.study4

/**
 * 中缀表达式
 *
 * infix  1.让代码更加简洁易懂   2.自定义操作符
 *
 * 使用条件：
 *  a.必须是成员函数(类里面定义的函数)或者是扩展函数
 *  b.必须只有一个参数
 *  c.参数不能是可变参数或者是默认参数
 */
fun main(args: Array<String>) {
    val p = Person()
    p.sayHelloTo("李四")

    p sayHelloTo "王五"

    //自定义操作符 区间 二元元祖 三元元祖

    val pair = Pair<String, Int>("张三", 10)

    val pair1 = "李四" to 10

    println(pair1.first)
    println(pair1.second)

}


class Person {

    infix fun sayHelloTo(name: String) {
        println("你好  $name")
    }
}