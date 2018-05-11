/**
 * https://www.kotlincn.net/docs/reference/returns.html
 * 
 * return。默认从最直接包围它的函数或者匿名函数返回。
 * break。终止最直接包围它的循环。
 * continue。继续下一次最直接包围它的循环。
 */

package com.demo.condition

fun breakMethod() {
    //表达式增加标签
    loop@ for (i in 1..100) {

        if (i == 5) {
            break@loop
        }
        println("breakMethod i = $i")
    }
}

fun continueMethod() {
    //表达式增加标签
    loop@ for (i in 1..10) {
        if (i == 5) {
            continue@loop
        }
        println("continueMethod i = $i")
    }
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // 非局部直接返回到 foo() 的调用者
        println(it)
    }
    println("this point is unreachable 不会打印")
}


fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 3) return@lit // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
        println(it)
    }
    println(" done with explicit label 会打印")
}

/**
 * 通常情况下使用隐式标签更方便。 该标签与接受该 lambda 的函数同名
 */
fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // 局部返回到该 lambda 表达式的调用者，即 forEach 循环
        println(it)
    }
    println(" done with implicit label")
}

/**
 * 用一个匿名函数替代 lambda 表达式。 匿名函数内部的 return 语句将从该匿名函数自身返回
 */
fun foo4() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // 局部返回到匿名函数的调用者，即 forEach 循环
        println(value)
    })
    println(" done with anonymous function")
}

/**
 * 当要返一个回值的时候，解析器优先选用标签限制的 return，即
 *
 * return@a 1
 * 意为“从标签 @a 返回 1”，而不是“返回一个标签标注的表达式 (@a 1)”。
 */
fun foo5() {
    var result = run loop@ {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop 100 // 从传入 run 的 lambda 表达式非局部返回
            println(it)
        }
    }
    println("done with nested loop result = $result")
}


fun main(args: Array<String>) {
//    breakMethod()
//    continueMethod()
    foo5()
}