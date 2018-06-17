package com.demo.condition

/**
 * 反向区间和区间的反转
 */
fun main(args: Array<String>) {
    //定义反向区间
//    val range = 50 downTo 1
//
//    range.forEach {
//        println(it)
//    }

    //区间的反转
    val range1 = 1..30
    val reversed = range1.reversed()

//    for (i in reversed) {
//        println(i)
//    }
    //步长为5
    for (i in reversed step 5) {
        println(i)
    }

}