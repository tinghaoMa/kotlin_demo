/**
 * 类、对象、接口、构造函数、方法、属性和它们的 setter 都可以有 可见性修饰符。 （getter 总是与属性有着相同的可见性。）
 * 在 Kotlin 中有这四个可见性修饰符：
 * private、
 * protected、
 * internal、
 * public。
 * 如果没有显式指定修饰符的话，默认可见性是 public。
 */
package com.demo.classes.demo

/**
 * 类和接口
 * 对于类内部声明的成员：
 * private 意味着只在这个类内部（包含其所有成员）可见；
 * protected—— 和 private一样 + 在子类中可见。
 * internal —— 能见到类声明的 本模块内 的任何客户端都可见其 internal 成员；
 * public —— 能见到类声明的任何客户端都可见其 public 成员。
 * 注意 对于Java用户：Kotlin 中外部类不能访问内部类的 private 成员。
 * 如果你覆盖一个 protected 成员并且没有显式指定其可见性，该成员还会是 protected 可见性。
 */
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // 默认 public

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a 不可见
    // b、c、d 可见
    // Nested 和 e 可见

    override val b = 5   // “b”为 protected
}

/**
 * 私有构造函数 显示指明 constructor
 */
class Unrelated private constructor(o: Outer) {
    // o.a、o.b 不可见
    // o.c 和 o.d 可见（相同模块）
    // Outer.Nested 不可见，Nested::e 也不可见


}

fun main(args: Array<String>) {


}