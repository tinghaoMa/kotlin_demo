package com.demo.function.param

fun main(args: Array<String>) {
    sayHello()
    //具名参数
    sayHello("李四")

    /*************可变参数***********/
    val a = 1
    val b = 1
    val c = 1


    println(add(a, b,c,10,20,30))


}

/**
 * a的类型是IntArray 需遍历在求和
 */
fun add(vararg a: Int): Int {
    var result = 0

    a.forEach {
        result += it
    }
    return result
}


/**
 * 默认参数
 */
fun sayHello(name: String = "张三") {
    println(name)
}