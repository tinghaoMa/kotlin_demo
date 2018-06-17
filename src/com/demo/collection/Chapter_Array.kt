package com.demo.collection

/**
 * Any 类似与Object
 *
 * 8个类型的基本数组可以通过Array创建或者自己的类型Array创建
 *
 * 字符串数组只能通过Array来创建
 *
 */
fun main(args: Array<String>) {
    val array1 = arrayOf("张三", "李云", "爸爸去哪儿了")

    val array2 = arrayOf(1, 2, 3)

    val array3 = arrayOf('a', 'b', 'c')

    //数组类型为 Array<Any>
    val array4 = arrayOf("张三", 10, 'a')


    val intArray = IntArray(10)

    //初始化三个元素，每个元素都是10
    val intArray2 = IntArray(3) {
        10
    }

    //数组遍历
//    for (i in intArray2) {
//        println(i)
//    }
//
//    intArray2.forEachIndexed { index, i ->
//        println("index = $index    i = $i")
//
//    }

    //数组元素的修改

    var array5 = arrayOf(1, 2, 3, 4, 5)
    //修改2为9
    //第一种
    array5[1] = 9

    //第二种
    array5.set(3, 10)

    array5.forEach {
        println(it)
    }


}