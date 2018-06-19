package com.demo.study5.a

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 3:24 PM
 * @class describe
 *
 * 高阶函数和lambda一般是成对出现的
 */

fun main(args: Array<String>) {
    val a = 10
    val b = 20
    //匿名函数
    val add = cacl(a, b, { m, n ->
        m + n
    })
    println(add)


    val sub = cacl(a, b, { m, n ->
        m - n
    })
    println(sub)

}

fun cacl(a: Int, b: Int, block: (Int, Int) -> Int): Int {
    return block(a, b)
}