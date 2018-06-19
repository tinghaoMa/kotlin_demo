package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 3:49 PM
 * @class describe
 */

fun main(args: Array<String>) {
    //嵌套无参的匿名函数
    //调用方式1
//    {
//        println("hello world")
//    }()
    //调用方式2
    {
        println("hello world")
    }.invoke()

}