/**
 * 扩展函数
 *
 * https://www.kotlincn.net/docs/reference/extensions.html#%E6%89%A9%E5%B1%95%E5%87%BD%E6%95%B0
 *
 */
package com.demo.classes.demo

//fun MutableList<Int>.swap(index1: Int, index2: Int, str: String) {
//    val tmp = this[index1] // “this”对应该列表
//    this[index1] = this[index2]
//    this[index2] = tmp
//}

//fun main(args: Array<String>) {
//    val l = mutableListOf(1, 2, 3)
//    l.swap(0, 1) // “swap()”内部的“this”得到“l”的值
//    l.forEach {
//        println("$it")
//    }
//
//}

//class ExtFunction {
//}
//
//
//fun ExtFunction.sayHello(str: String, end: String = "11111") {
//    println(str + end)
//}
//
//fun main(args: Array<String>) {
//    ExtFunction().sayHello("hello world ")
//}

/**
 * 扩展是静态解析的
 *
 * https://www.kotlincn.net/docs/reference/extensions.html#%E6%89%A9%E5%B1%95%E6%98%AF%E9%9D%99%E6%80%81%E8%A7%A3%E6%9E%90%E7%9A%84
 */
//open class C1
//
//class D : C1()
//
//fun C1.foo() = "c"
//
//fun D.foo() = "d"
//
//fun printFoo(c: C1) {
//    println(c.foo())
//}
//
//fun main(args: Array<String>) {
//    printFoo(D())
//}

/**
 * 如果一个类定义有一个成员函数和一个扩展函数，
 * 而这两个函数又有相同的接收者类型、
 * 相同的名字并且都适用给定的参数，
 * 这种情况总是取成员函数
 */
//class C1 {
//    fun foo() {
//        println("member")
//    }
//}
//
//fun C1.foo() {
//    println("extension")
//}


//可空接收者
//fun Any?.toString(): String {
//    if (this == null) return "null"
//    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
//    // 解析为 Any 类的成员函数
//    return toString()
//}
//
//class C1 {
//    fun foo() { println("member") }
//}
//
//fun C1.foo(i: Int) { println("extension") }
//
//
//fun main(args: Array<String>) {
//    C1().foo(1)
//    var a = null
//    println(a.toString())
//}

/**
 * 扩展属性
 * 由于扩展没有实际的将成员插入类中，因此对扩展属性来说幕后字段是无效的
 * 扩展属性不能有初始化器
 *
 * https://www.kotlincn.net/docs/reference/extensions.html#%E6%89%A9%E5%B1%95%E5%B1%9E%E6%80%A7
 *
 */
class Property{

}

val Property.name
    get() =1

fun main(args: Array<String>) {
    println(Property().name)
}