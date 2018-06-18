package com.demo.function

/**
 * 递归
 *
 *
 * 尾递归优化
 *
 * 什么是尾递归？
 * 定义: 函数在调用自己之后没有执行其他任何的操作就是尾递归
 *
 * 第一步：只有尾递归才能优化
 * 第二步：加上关键字tailrec
 *
 * 原理 ：将递归转换为迭代
 *
 */


fun main(args: Array<String>) {
    val fact = fact(5)
//    println(fact)


//    val sum = sum(10)
//    println(sum)

    //递归容易出现java.lang.StackOverflowError
//    val sum2 = sumadd2(100000)
//    println(sum2)


    val sum3 = sum3(100000)
    println(sum3)

}

/**
 * 求一个数的阶乘
 */
fun fact(num: Int): Int {
    if (num == 1) {
        return 1
    } else {
        return num * fact(num - 1)
    }
}


/**
 * 求1~n的和 迭代
 */
fun sum(num: Int): Int {

    var result = 0
    var copyNum = num

    while (copyNum > 0) {
        result += copyNum
        copyNum--
    }
    return result
}


/**
 * 求1~n的和 递归
 */
fun sumadd2(num: Int): Int {
    if (num == 1) {
        return 1
    } else {
        return num + sum2(num - 1)//调用自己的方法之后又做了加操作 所以不是尾递归
    }
}


/**
 * 求1~n的和 尾递归
 */
tailrec fun sum3(num: Int, result: Int = 0): Int {
    if (num == 1) {
        return result + 1
    } else {
        return sum3(num - 1, result + num)
    }
}