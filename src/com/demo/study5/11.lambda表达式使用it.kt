package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 4:04 PM
 * @class describe
 *
 * lambda使用的时候 如果是一个参数 可以省略参数名 默认是通过it实现
 *
 */

fun main(args: Array<String>) {
    var a = 10
    val result = haha(a, {
        it + 10
    })
    println(result)

}


fun haha(a: Int, block: (Int) -> Int): Int {
    return block(a)
}