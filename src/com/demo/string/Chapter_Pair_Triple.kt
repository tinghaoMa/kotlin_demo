package com.demo.string

/**
 * 二元元祖 Pair
 * 三元元祖 Triple
 */
fun main(args: Array<String>) {

//    val pair = Pair<String, Int>("张三", 19)

    val pair = "张三" to (19)

    println(pair.first)
    println(pair.second)

    val result = getResult()

    println(result.first)
    println(result.second)

    var triple = Triple<String, String, Int>("李四", "北京", 20)
    println(triple.first)
    println(triple.second)
    println(triple.third)


}


fun getResult(): Pair<String, String> {
    return Pair("a", "b")
}