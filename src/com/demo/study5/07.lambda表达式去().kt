package com.demo.study5.b

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 3:24 PM
 * @class describe
 *
 *
 */

fun main(args: Array<String>) {
    val a = 10
    val b = 20
    //如果最后一个参数是lambda表达式，可以把()前移
    val add = cacl(a, b) { m, n ->
        m + n
    }
    println(add)


    val sub = cacl(a, b) { m, n ->
        m - n
    }
    println(sub)

}

fun cacl(a: Int, b: Int, block: (Int, Int) -> Int): Int {
    return block(a, b)
}