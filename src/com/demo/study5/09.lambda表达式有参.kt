package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 3:49 PM
 * @class describe
 */

fun main(args: Array<String>) {
    //嵌套有参的匿名函数
//    {a:Int,b:Int->
//        println(a + b)
//    }(3,4)


    {a:Int,b:Int->
        println(a + b)
    }.invoke(10,20)
}