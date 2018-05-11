package com.demo.function

/**
 * 定义函数
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * 将表达式作为函数体、返回值类型自动推断的函数
 */
fun sum1(a: Int, b: Int) = a + b

/**
 * 参数增加默认值
 */
fun sum2(a: Int, b: Int = 10) = a + b

/**
 * 如果一个默认参数在一个无默认值的参数之前，那么该默认值只能通过使用命名参数调用该函数来使用：
 */
fun foo(bar: Int = 0, baz: Int): Int {
    return bar + baz    // 使用默认值 bar = 0
}

/**
 * 如果最后一个 lambda 表达式参数从括号外传给函数函数调用，那么允许默认参数不传值
 */
fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit): Int {
    qux() //执行 lambda表达式
    return bar + baz
}

/**
 * 后一个参数可以引用前一个参数
 */
fun foo1(a: Int, b: Int = a + 2): Int {
    return a + b
}


/**
 * 中缀表示法
 *
 *
 * 标有 infix 关键字的函数也可以使用中缀表示法（忽略该调用的点与圆括号）调用。中缀函数必须满足以下要求：

    它们必须是成员函数或扩展函数；
    它们必须只有一个参数；
    其参数不得接受可变数量的参数且不能有默认值。
 */
infix fun Int.myshl(x: Int): Int {
    return x+2
}



fun main(args: Array<String>) {
    val sum = sum(1, 2)
    println("sum  = $sum")
    println("sum1(3,4) = ${sum1(3, 4)}")
    println("sum2(3) = ${sum2(3)}")
    println("foo(3) = ${foo(baz = 3)}")

    println(foo(1) { println("hello") }) // 使用默认值 baz = 1
    println(foo { println("hello") }) // 使用两个默认值 bar = 0 与 baz = 1

    println(foo1(2))


    println("中缀表示法 "+ (1 myshl 2))

}