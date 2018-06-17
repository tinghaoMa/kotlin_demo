package com.demo.collection

/**
 * 数组角标的查找
 */
fun main(args: Array<String>) {

    val array = arrayOf("张三", "李四", "王二毛", "张大仙", "小逗比", "张三", "王者荣耀")
    //indexOf 能找到就返回第一个对应元素角标位置 否则返回-1
    val index1 = array.indexOf("张三")
    val index2 = array.indexOf("老王")
    println(index1)
    println(index2)
    //lastIndexOf  能找到就返回最后一个 或者返回-1
    val index3 = array.lastIndexOf("张三")
    println(index3)

    //找空元素
    val str: String? = null
    val index4 = array.lastIndexOf(str)
    println(index4)


    println("/************************高阶函数实现************************/")
    //查找第一个姓张的人的角标
    val index5 = array.indexOfFirst {
        it.startsWith("张")
    }
    println(index5)

    //查找最后一个姓张的人的角标
    val index6 = array.indexOfLast {
        it.startsWith("张")
    }
    println(index6)


}