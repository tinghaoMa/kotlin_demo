/**
 * 接口 可以有属性但必须声明为抽象或提供访问器实现
 * https://www.kotlincn.net/docs/reference/interfaces.html#%E6%8E%A5%E5%8F%A3
 */
package com.demo.classes.demo

/**
 * 在接口中声明的属性要么是抽象的，要么提供访问器的实现。
 * 在接口中声明的属性不能有幕后字段（backing field），因此接口中声明的访问器不能引用它们
 */
interface MyInterface {
    val prop: Int
    val propertyWithImplementation: String
        get() = "foo"

    fun bar()
    fun foo() {
        // 可选的方法体
        println(prop)
        println(propertyWithImplementation)
    }
}

class Child : MyInterface {
    override val prop: Int
        get() = 11111

    override fun bar() {

    }

    override fun foo() {
        super.foo()
    }
}

fun main(args: Array<String>) {
    Child().foo()
    println(Child().prop)
}
