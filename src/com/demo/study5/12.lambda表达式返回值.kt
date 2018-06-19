package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 4:13 PM
 * @class describe
 */

fun main(args: Array<String>) {


    //lambda表达式在没有使用的时候返回值是（->Unit
    val test1 = {

    }
    //lambda表达式在执行的时候的返回值根据函数体里面的返回值确定 不需要使用return语句
    val test2 = {
        ""
    }()

    val test3 = {
        1
    }()

    val test4 = {
        'a'
    }()

}