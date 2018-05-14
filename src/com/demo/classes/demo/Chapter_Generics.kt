/**
 * 泛型
 * https://zhuanlan.zhihu.com/p/32583310 in out详解
 * https://www.kotlincn.net/docs/reference/generics.html#%E6%B3%9B%E5%9E%8B
 */
package com.demo.classes.demo

class Box<T>(t: T) {
    var value = t
}


fun main(args: Array<String>) {
    val box = Box(1)
    val box1 = Box<String>("hello world")
}