package com.demo.study5

import java.util.TreeSet

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 2:45 PM
 * @class describe
 */

fun main(args: Array<String>) {

    /***************************setOf********************************/
    val set1 = setOf<String>("a", "b", "c")
    println(set1.size)
    set1.forEach {
        println(it)
    }

    /***************************mutableSetOf********************************/
    val set2 = mutableSetOf<String>("a", "b", "c", "d")
    set2.add("e")
    set2.forEach {
        println(it)
    }

    /***************************java集合********************************/

    val treeSet = TreeSet<String>()
    val hashMap = HashMap<String, String>()

}