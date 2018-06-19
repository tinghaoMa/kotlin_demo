package com.demo.study4.d

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 10:37 AM
 * @class
 *
 * 1.字段必须是val
 * 2.by lazy 放在成员变量里面可以单独存在
 * 3.by lazy 返回值是最后一行
 * 4.by lazy 是线程安全的
 */

val name: String  by lazy {
    println("初始化")
    "张三"
}


fun main(args: Array<String>) {
    println(name)
    println(name)
}


class Person {
    val name: String  by lazy { "张三" }
}