package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 5:32 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val list = listOf<Char>('z', 'v', 'a', 'x', 'b')
    //正序排序
    val sorted = list.sorted()
    println(sorted)
    //倒序排序
    val reversed = list.sortedDescending()
    println(reversed)

    //按字段排序  正序排序
    val persons = listOf(Person("张三", 50), Person("李四", 70), Person("王五", 20))

    val agesList = persons.sortedBy {
        it.age
    }
    println(agesList)

    //按字段排序 倒叙排序

    val sortedByDescending = persons.sortedByDescending { it.age }

    println(sortedByDescending)



}

data class Person(var name: String, var age: Int)