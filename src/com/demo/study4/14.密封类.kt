package com.demo.study4

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 1:17 PM
 * @class describe
 * 密封类 sealed 和枚举类似  密封类 封装的是类型 枚举封装的是数据
 */

fun main(args: Array<String>) {
    val start = ESnow()
    val hasRight = hasRight(start)
    println(hasRight)

    val aStark = NedStark.AStark()
    println(hasRight(aStark))
}

fun hasRight(stark: NedStark): Boolean {
    return when (stark) {
        is NedStark.AStark -> true
        is NedStark.BStark -> true
        is NedStark.CStark -> true
        is NedStark.DStark -> true
        else -> false
    }
}


sealed class NedStark {
    class AStark : NedStark()
    class BStark : NedStark()
    class CStark : NedStark()
    class DStark : NedStark()
}


class ESnow : NedStark()