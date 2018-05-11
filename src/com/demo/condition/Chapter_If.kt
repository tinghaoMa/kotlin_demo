/**
 * 控制流：if
 */
package com.demo.condition

/**
 * 如果你使用 if 作为表达式而不是语句（例如：返回它的值或者把它赋给变量），该表达式需要有 else 分支。
 */
fun ifCondition(a:Int,b:Int):Int{

    // 传统用法
//    var max = a
//    if (a < b) max = b

    // With else
//    var max: Int
//    if (a > b) {
//        max = a
//    } else {
//        max = b
//    }

    // 作为表达式
    val max = if (a > b) a else b
    return max
}



fun main(args: Array<String>) {
    println("${ifCondition(3,4)}")
}