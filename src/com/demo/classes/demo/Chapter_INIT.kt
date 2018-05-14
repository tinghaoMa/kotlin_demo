/**
 * https://www.kotlincn.net/docs/reference/classes.html#%E6%B4%BE%E7%94%9F%E7%B1%BB%E5%88%9D%E5%A7%8B%E5%8C%96%E9%A1%BA%E5%BA%8F
 */
package com.demo.classes.demo


open class Base(val name: String) {

    init {
        println("Initializing Base")
    }

    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
        name: String,
        val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init {
        println("Initializing Derived")
    }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

fun main(args: Array<String>) {
    println("Constructing Derived(\"hello\", \"world\")")
    val d = Derived("hello", "world")
}