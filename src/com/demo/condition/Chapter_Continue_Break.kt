package com.demo.condition

/**
 * break 和continue 只能用在普通for循环里，foreach 不能使用
 */
fun main(args: Array<String>) {
    val str = "adbcde"

    for (c in str) {
        if (c == 'c') {
            break
        }
        println(c)
    }

    println("************")

    for (c in str) {
        if (c == 'c') {
            continue
        }
        println(c)
    }

    str.forEach {
        return
    }
}