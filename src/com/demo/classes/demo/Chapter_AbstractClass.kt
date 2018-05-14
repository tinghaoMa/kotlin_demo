/**
 * 抽象类
 * https://www.kotlincn.net/docs/reference/classes.html#%E6%8A%BD%E8%B1%A1%E7%B1%BB
 */
package com.demo.classes.demo

open class Base2 {
    open fun f() {
        println("base2 f()")
    }
}

/**
 * 可以用一个抽象成员覆盖一个非抽象的开放成员
 */
abstract class DerivedChild : Base2() {
    override abstract fun f()
}

fun main(args: Array<String>) {
    Base2().f()
}
