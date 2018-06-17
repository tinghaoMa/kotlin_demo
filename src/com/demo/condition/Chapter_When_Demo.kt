package com.demo.condition

/**
 * Kotlin   when 分支可以取区间  多条件判断
 *
 * Kotlin  when表达式原理：
 * 简单的when表达式通过switch实现
 * 复杂的when表达式通过if实现
 *
 *
 */
fun main(args: Array<String>) {
    val result = getResult(10)
//    println(result)

    val result1 = getResult1(49)
//    println(result1)


    val result2 = getResult2(40)
    println(result2)


}

fun getResult(age: Int): String {
    when (age) {
        in 1..5 -> {
            return "<=5岁"
        }
        6 -> {
            return ">5岁"
        }
        else -> {
            return "仙人"
        }
    }
}

/**
 * when不需要参数
 */
fun getResult1(age: Int): String {

    when {
        age == 7 -> {
            return "hello world"
        }
        age in 1..100 -> {
            return "good job"
        }
        else -> {
            return "default"
        }
    }
}

/**
 * when表达式返回值在最后一行{} lambda表达式也是最后一行为返回值
 */
fun getResult2(age: Int): String {

    return when {
        age == 7 -> {
            "hello world"
        }
        age in 1..100 -> {
            "good job"

            "aaaa"

            10

            "123"
        }
        else -> {
            "default"
        }
    }
}