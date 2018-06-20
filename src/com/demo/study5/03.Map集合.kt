package com.demo.study5

import java.util.*

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 2:56 PM
 * @class describe
 */


fun main(args: Array<String>) {
    /***************************mapOf********************************/
    val map = mapOf<String, String>("中国" to "China", "美国" to "English")
    map.forEach {
        println(it)
    }
    /******************************map2*****************************/
    val map2 = mutableMapOf("中国" to "China", "美国" to "English")
    /***************************遍历所有的key********************************/
    val keys = map2.keys

    keys.forEach { println(it) }

    /***************************遍历所有的value********************************/

    val values = map2.values
    values.forEach { println(it) }

    /***************************遍历key 和遍历 value********************************/
    val entries = map2.entries

    entries.forEach {
        println(it.key + "    " + it.value)
    }

    map2.forEach { t, u ->
        println("key =$t  value = $u")
    }

    for ((key, value) in map2) {
        println("key =$key  value = $value")
    }


    /***************************java集合********************************/

    val hashMapOf = hashMapOf<String, String>()
    val treeMap = TreeMap<String, String>()



    /***************************flatMap********************************/

    /**
     * map
     *
     * flatmap 把所有集合元素打碎变成一个map
     */

    var list = listOf(listOf(10, 20), listOf(30, 40), listOf(50, 60))

    var mapList = list.map {
        println(it)
    }

    var flatMapList = list.flatMap { it -> it.asIterable() }

    println(flatMapList)
}