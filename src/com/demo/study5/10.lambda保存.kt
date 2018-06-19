package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 3:57 PM
 * @class describe
 */

fun main(args: Array<String>) {

    val block = {
        println("hello")
    }

    block()
    block.invoke()

    val block1 = { m: Int, n: Int ->
        m + n
    }

    println(block1(1, 3))
    println(block1.invoke(1, 4))

    //空的函数变量类型
    val block2: (() -> Unit)? = null
//    block2()  这个时候只能使用invoke方式
    block2?.invoke()




}