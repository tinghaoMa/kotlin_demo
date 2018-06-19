package com.demo.study5

import kotlin.math.min

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 5:53 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val list = listOf("a", "d", "z")
    //最大值
    val max = list.max()
    println(max)
    //最小值
    println(list.min())

    val persons = listOf(Person("张三", 50), Person("李四", 70), Person("王五", 20))
    //对象的最大值
    val maxBy = persons.maxBy { it.age }
    println(maxBy)
    //对象的最小值
    val minBy = persons.minBy { it.age }
    println(minBy)
}