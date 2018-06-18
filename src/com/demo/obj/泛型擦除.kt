package com.demo.obj

/**
 * 泛型擦除
 * kotlin 解决泛型擦除方案：
 * 第一步：泛型前加一个reified关键字
 * 第二步：方法前加inline 关键字
 *
 */
fun main(args: Array<String>) {
//    val java = String::class.java
//    println(java)

    parseType("haha")
    parseType(1)


}


inline fun <reified T> parseType(thing: T) {
    val java = T::class.java.name
    println(java)
}