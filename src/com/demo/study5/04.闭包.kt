package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 3:15 PM
 * @class describe
 *
 *
 * 闭包：
 *  Python :一个函数返回了一个内部函数，该内部函数引用了外部函数的相关参数和变量，
 *  我们把该返回的内部函数称为闭包
 *
 *  Kotlin里面我们常说的闭包就是lambda表达式
 *
 */

fun main(args: Array<String>) {
//    test()
//    test()
//    test()

    val test = test2()

    test()
    test()
    test()
}


//闭包 lambda表达式 函数式编程 函数可以作为方法的返回值 方法也可以作为函数的参数
fun test2(): () -> Unit {
    var a = 10
    return {
        println(a)
        a++
    }
}


/**
 * 函数不保存状态  闭包可以让函数携带状态
 */
fun test() {
    var a = 10
    println(a)
    a++
}
