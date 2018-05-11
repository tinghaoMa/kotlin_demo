/**
 * 字符串
 *
 *
 */
package com.demo.string

fun main(args: Array<String>) {
    val i = 10
    println("i = $i") // 输出“i = 10”

    //花括号括起来的任意表达式:
    val s = "abc"
    println("$s.length is ${s.length}") // 输出“abc.length is 3”

    //如果你需要在原始字符串中表示字面值 $ 字符（它不支持反斜杠转义），你可以用下列语法：
    val price = """${'$'}9.99"""

    println("price = $price")
}