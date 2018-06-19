package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 6:07 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val list = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六", "张三")
    //姓张的一部分 其他的一部分

    val partition = list.partition {
        it.startsWith("张")
    }

    println(partition.first)
    println(partition.second)
}