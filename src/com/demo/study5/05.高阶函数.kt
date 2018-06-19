package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 3:24 PM
 * @class describe
 *
 * 函数的参数里面传递函数参数的话 就是高阶函数
 *
 */

fun main(args: Array<String>) {
    val a = 10
    val b = 20

    val add = cacl(a, b, ::add)
    println(add)

    val sub = cacl(a, b, ::sub)
    println(sub)

}

/**
 * 函数的参数里面有函数
 * 第三个参数是函数类型 说明kotlin里面支持函数作为参数
 */
fun cacl(a: Int, b: Int, block: (Int, Int) -> Int): Int {
    val result = block(a, b)
    return result
}

//普通函数
fun add(a: Int, b: Int): Int {
    return a + b
}

//普通函数
fun sub(a: Int, b: Int): Int {
    return a - b
}