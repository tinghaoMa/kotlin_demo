/**
 * https://www.kotlincn.net/docs/reference/classes.html#%E8%A6%86%E7%9B%96%E5%B1%9E%E6%80%A7
 */
package com.demo.classes.demo

open class Foo {
    open val x: Int get() {
        return 10
    }
}

class Bar1 : Foo() {
    override val x: Int =3
}


fun main(args: Array<String>) {
    Bar1().x.also { println("$it") }
    Foo().x.also { println("$it") }
}