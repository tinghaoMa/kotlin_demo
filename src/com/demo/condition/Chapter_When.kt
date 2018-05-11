/**
 * 控制流 when
 * 如果其他分支都不满足条件将会求值 else 分支。 如果 when 作为一个表达式使用，则必须有 else 分支
 */
package com.demo.condition

import java.lang.Integer.parseInt


fun whenMethod(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x is neither 1 nor 2")
        }
    }

    //用作表达式
    var result = when (2) {
        1 -> println("表达式 x == 1")
        2 -> {
            println("表达式 x == 2")
        }
        else -> { // 注意这个块
            println("表达式 x is neither 1 nor 2")
        }
    }

    //如果很多分支需要用相同的方式处理，则可以把多个分支条件放在一起，用逗号分隔
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    //可以用任意表达式（而不只是常量）作为分支条件
    when (x) {
        parseInt("3") -> println("s encodes x")
        else -> println("s does not encode x")
    }


    //可以检测一个值在（in）或者不在（!in）一个区间或者集合中：
    val validNumbers = arrayOf(1, 2, 3, 4)

    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

//可能性是检测一个值是（is）或者不是（!is）一个特定类型的值
fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}


fun main(args: Array<String>) {
    whenMethod(4)

    println("hasPrefix():${hasPrefix("prefix124")} ")
}
