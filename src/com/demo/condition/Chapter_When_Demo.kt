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
    println(result)
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