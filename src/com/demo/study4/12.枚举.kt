package com.demo.study4

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 11:40 AM
 * @class describe
 */

fun main(args: Array<String>) {
    println(WEEK.Friday)
    //遍历
    WEEK.values().forEach {
        println(it)
    }

    todo(WEEK.Monday)
}

enum class WEEK {
    Monday, Tuesday, Wensday, Thursday, Friday, Saturday, Sunday
}


fun todo(week: WEEK) {

    when (week) {
        in WEEK.Monday..WEEK.Friday -> {
            println("上班")
        }
        WEEK.Saturday, WEEK.Sunday -> {
            println("休息")
        }
    }


}