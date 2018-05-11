/**
 * 集合
 */
package com.demo

fun main(args: Array<String>) {
    val items = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }


    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }


    //数组
    //创建空数组，只读

    val arrayEmpty = emptyArray<String>()


    //创建指定长度的可空数组
    val array1 = arrayOfNulls<Int>(5)
    for (i in 0..2) {
        array1[i] = i
    }

    //创建指定长度数组 初始化长度为5，元素均为0的数组
    val array4 = Array(5, { 0 })


    //初始化长度为5，元素均为""的数组，并为数组前3个元素赋值，"0", "1", "2", "", ""
    val array5: Array<String> = Array(5, { "" })
    for (i in 0..2) {
        array5[i] = i.toString()
    }


    //使用闭包创建数组

    val array6 = Array(4, { i -> i * i })  //0,1,4,9,16


    //使用Kotlin封装方法创建数组
    val array7 = arrayOf(1, 2, 3, 4)
    
    val array8 = intArrayOf(1, 2, 3, 4)
}