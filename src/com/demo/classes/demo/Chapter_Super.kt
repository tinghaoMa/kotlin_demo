/**
 * 调用超类实现
 * https://www.kotlincn.net/docs/reference/classes.html#%E8%B0%83%E7%94%A8%E8%B6%85%E7%B1%BB%E5%AE%9E%E7%8E%B0
 */
package com.demo.classes.demo

open class Foo1 {
    open fun f() {
        println("Foo.f() 1111111 " + x)
    }

    open val x: Int get() = 1
}

class Bar : Foo1() {
    override fun f() {
        super.f()
        println("Bar.f() " + x)
    }

    override val x: Int get() = super.x + 1
}


/**
 * 在一个内部类中访问外部类的超类，可以通过由外部类名限定的 super 关键字来实现：super@Outer：
 */
class Bar2 : Foo1() {
    override fun f() {
        println("Bar2 f 22222")
    }

    override val x: Int get() = 0

    inner class Baz {
        fun g() {
            super@Bar2.f() // 调用 Foo1 实现的 f()
            println(super@Bar2.x) // 使用 Foo 实现的 x 的 getter
        }
    }
}


fun main(args: Array<String>) {
    Bar().f()
    Bar2().Baz().g()
}