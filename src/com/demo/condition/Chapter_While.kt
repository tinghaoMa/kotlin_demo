/**
 * 控制流 while
 */
package com.demo.condition

fun add(num: Int) {
    var x = num
    adb@ while (x > 0) {
        println("x++ = ${x++}")
        if (x > 10) {
            break@adb
        }
    }
}


fun main(args: Array<String>) {
    add(1)

    forEach@for(item in 0..10){
        if(item==5){
            continue@forEach
        }
        println("item = $item")
    }
}