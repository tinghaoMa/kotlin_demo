package com.demo.operator

/**
 * 运算符重载
 *
 * Kotlin里面每一个运算符都对应一个fun，运算符相当于方法的简写
 *
 *  a + b	a.plus(b)
 *  a - b	a.minus(b)
 *  a * b	a.times(b)
 *  a / b	a.div(b)
 *  a % b	a.rem(b)、 a.mod(b) （已弃用）
 *  a..b	a.rangeTo(b)
 *
 *
 * 第一步：找到对应的函数
 * 第二步：添加关键字operator
 *
 *
 */

fun main(args: Array<String>) {
    val a = 10
    val b = 20
    val sum = a + b
    val sum1 = a.plus(b)


    val girl1 = Girl()
    val girl2 = Girl()
    girl2.name = "王二麻"

    val newGirl = girl1 + girl2
    println(newGirl.name)
    println(newGirl.age)

}


class Girl {
    var name = "张三"
    var age = 20

    //定义对应的运算符函数 关键字 operator
    operator fun plus(girl: Girl): Girl {
        return this
    }

    //年龄相加
//    operator fun plus(girl: Girl): Int {
//        return this.age + girl.age
//    }

}