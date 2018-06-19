package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 5:59 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val list = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六","张三")

    //把重复的张三去掉
    val toSet = list.toSet()
    println(toSet)

    val result = list.distinctBy { it }
    println(result)

    val result1 = list.distinct()
    println(result1)

    //把重复的同姓的去掉

    val result2 = list.distinctBy {
        it.substring(0,1)
    }
    println(result2)

}