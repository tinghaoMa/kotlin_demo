package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 5:43 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val list = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六")

    //姓张的一组 姓李的一组 其他的一组

    val groupBy = list.groupBy {
        when {
            it.startsWith("张") -> "张"
            it.startsWith("李") -> "李"
            else -> "其他"
        }
    }

    println(groupBy)

}