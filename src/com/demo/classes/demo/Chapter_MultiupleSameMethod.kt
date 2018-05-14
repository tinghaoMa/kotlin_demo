/**
 * 多个超类拥有相同的方法
 *
 * 为了表示采用从哪个超类型继承的实现，我们使用由尖括号中超类型名限定的 super，如 super<Base>：
 * https://www.kotlincn.net/docs/reference/classes.html#%E8%A6%86%E7%9B%96%E8%A7%84%E5%88%99
 */
package com.demo.classes.demo

open class A {
    open fun f() { println("A") }
    fun a() { println("a") }
}

interface B {
    fun f() { println("B") } // 接口成员默认就是“open”的
    fun b() { println("b") }
}

class C() : A(), B {
    // 编译器要求覆盖 f()：
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}

fun main(args: Array<String>) {
    C().f()
}