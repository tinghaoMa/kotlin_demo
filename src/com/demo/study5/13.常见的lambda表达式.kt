package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 4:17 PM
 * @class describe
 */

fun main(args: Array<String>) {


    /***************************forEach********************************/
    val str = "张三"

    val func = { char: Char ->
        println(char)
    }
    str.forEach(func)
    println("--------------------")
    str.forEach({ char ->
        println(char)
    })

    println("--------------------")
    str.forEach() { char ->
        println(char)
    }
    println("--------------------")

    //括号前移之后没有参数 可以删除
    str.forEach { char ->
        println(char)
    }
    println("--------------------")


    str.forEach {
        println(it)
    }

    /***************************indexOf********************************/
    val array = arrayOf("a", "b", "c")

    val indexOfFirst = array.indexOfFirst {
        it.startsWith("b")
    }
    println(indexOfFirst)
}