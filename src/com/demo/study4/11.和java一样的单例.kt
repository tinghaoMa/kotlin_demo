package com.demo.study4.w

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 11:34 AM
 * @class describe
 */

fun main(args: Array<String>) {
    println(Utils.instance.age)
    println(Utils.name)
}

class Utils {

    var age = 10

    companion object {
        //静态
        var name = "张三"

        val instance by lazy { Utils() } //惰性加载 只加载一次 并且线程安全
    }

}