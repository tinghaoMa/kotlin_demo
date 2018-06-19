package com.demo.study4

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 11:20 AM
 * @class describe
 *
 * Object 所有的字段都是静态的  方法不是
 * 使用条件：字段不多的时候使用
 *
 * kotlin没有static关键字
 * 怎么控制有的字段是static 有的字段不是static的呢？
 */

fun main(args: Array<String>) {
    val utils = Utils

    println(utils.name)
    utils.sayHello()
}

/**
 * 设置成一个单例
 */
object Utils {
    var name = "张三"  //static

    fun sayHello() {
        println("Utils.sayHello")
    }
}