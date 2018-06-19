package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 6:16 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val persons = listOf(
            Person("张三", 50),
            Person("李四", 70),
            Person("王五", 20)
    )

    //求出所有人的年龄之和
    val totalAge = persons.sumBy {
        it.age
    }
    println(totalAge)

//    persons.sumByDouble {
//
//    }


}