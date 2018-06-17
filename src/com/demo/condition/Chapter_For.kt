/**
 * 控制流 for
 */
package com.demo.condition

fun main(args: Array<String>) {
//    for (i in 1..3) {
//        println(i)
//    }
//    for (i in 6 downTo 0 step 2) {
//        println(i)
//    }

    //通过索引遍历一个数组或者一个 list
    val array = arrayOf("a", "b", "c")
    println("array.indices =${array.indices}")

    for (i in array.indices) {
        println("index = $i value= ${array[i]}")
    }

    //使用库函数遍历
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

    //直接输入  str.for 就会提示
    val str = "adbcd"
//    for (c in str) {
//        println(c)
//    }
//
//    for ((index,c) in str.withIndex()) {
//        println("index =$index   c =$c")
//    }

//    str.forEach {
//        println(it)
//    }


    str.forEachIndexed { index, c ->
        println("index =$index   c =$c")
    }
}