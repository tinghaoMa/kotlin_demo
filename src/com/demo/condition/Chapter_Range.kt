/**
 *https://www.kotlincn.net/docs/reference/ranges.html#%E5%8C%BA%E9%97%B4
 * 区间
 */
package com.demo.condition


fun main(args: Array<String>) {
    //定义range 几种写法

    val range1 = 1..100
    val range2 = 1.rangeTo(100)
    val range3 = IntRange(1, 100)

    //长整型
    val range4 = 1L..100L
    val range5 = 1L.rangeTo(100L)
    val range6 = LongRange(1, 100)

    //字符型区间
    val range7 = 'a'..'z'
    val range8 = 'a'.rangeTo('z')
    val range9 = CharRange('a', 'z')

    //区间遍历


    for ((index,i) in range1.withIndex()) {
        println("first index = $index  i = $i")

    }

    range1.forEachIndexed { index, i ->
        println("second index = $index  i = $i")

    }

    range7.forEach {
        println(it)
    }


    //使用 in 运算符来检测某个数字是否在指定区间内
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    //检测某个数字是否在指定区间外
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range  list.lastIndex =${list.lastIndex}")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too list.indices =${list.indices}")
    }

    //区间迭代
    for (x in 1..5) {
        println(x)
    }

    println()
    for (x in 1..10 step 2) {
        println(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        println(x)
    }
    println()
    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
        println(i)
    }


}
