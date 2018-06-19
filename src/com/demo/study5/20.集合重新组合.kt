package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 6:10 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val persons = listOf(
            Person("张三", 50),
            Person("李四", 70),
            Person("王五", 20)
    )


    val nameList = persons.map {
        it.name
    }
    println(nameList)

    val ageList = persons.map {
        it.age
    }

    println(ageList)

    val xingList = persons.map {
        it.name.substring(0, 1)
    }

    println(xingList)

}