/**
 * https://www.kotlincn.net/docs/reference/basic-syntax.html#%E4%BD%BF%E7%94%A8%E5%8F%AF%E7%A9%BA%E5%80%BC%E5%8F%8A-null-%E6%A3%80%E6%B5%8B
 *
 *
 * 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
 * 可空值及 null 检测
 *
 */
package com.demo.np

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // ……
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // 在空检测后，x 和 y 会自动转换为非空值
    println(x * y)
}

/**
 *
 * 类型检测及自动类型转换
 *
 *
 * is 运算符检测一个表达式是否某类型的一个实例。
 * 如果一个不可变的局部变量或属性已经判断出为某类型，
 * 那么检测后的分支中可以直接当作该类型使用，无需显式转换
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` 在该条件分支内自动转换成 `String`
        return obj.length
    }

    // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
    return null
}


fun getStringLength1(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` 在这一分支自动转换为 `String`
    return obj.length
}

fun getStringLength2(obj: Any): Int? {
    // `obj` 在 `&&` 右边自动转换成 `String` 类型
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}




fun main(args: Array<String>) {
//    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("99", "b")

    println(getStringLength2("123123"))
}