package com.demo.function

/**
 * 函数表达式
 */
fun main(args: Array<String>) {
    val a = 1
    val b = 2
    println(add(a, b))
    /*************:: 两个冒号代表 函数的引用***********/
    val pAdd = ::add


    /*************执行调用函数***********/

    println(pAdd(10, 20))
    println(pAdd.invoke(30, 20))

    val pAdd2 = ::add2
    println(pAdd2("hello   ", null))
    //invoke的好处是可以处理函数变量为空的情况下调用
    println(pAdd2?.invoke("hello kotlin   ", null))


    /*************函数变量，匿名函数***********/


    val pAdd3: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    println(pAdd3(100, 200))

}

fun add(a: Int, b: Int): Int {
    return a + b
}

/**
 * 函数表达式 只有一行代码 可以没有return
 */
fun add2(a: String, b: String?): String = a + b

fun add3(a: Int, b: Int) = a + b