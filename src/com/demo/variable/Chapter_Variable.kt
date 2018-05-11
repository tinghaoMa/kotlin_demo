/**
 *  变量
 *
 * var： var是一个可变变量，这是一个可以通过重新分配来更改为另一个值的变量。
 * 这种声明变量的方式和Java中声明变量的方式一样。
 *
 * val: val是一个只读变量，这种声明变量的方式相当于java中的final变量。
 * 一个val创建的时候必须初始化，因为以后不能被改变
 *
 * @author
 *
 */
package com.demo.variable

/**
 * 顶层变量
 */
val PI = 3.14
var X = 0


fun main(args: Array<String>) {

    println("顶层变量--${PI}")
    X += 1
    println("顶层变量--${X}")

    /**
     * 一次赋值（只读）的局部变量:
     */
    val a: Int = 1  // 立即赋值
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int  // 如果没有初始值类型不能省略
    c = 3       // 明确赋值

    println("a = $a, b = $b, c = $c")

    /**
     * 可变变量
     */
    var x = 5 // 自动推断出 `Int` 类型
    x += 1
    println("x = $x")


}