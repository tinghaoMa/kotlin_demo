package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 5:19 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val list = listOf("张三", "李四", "王五", "赵六", "张四", "李五", "李六")
    val list2 = listOf("周芷若", "张无忌", "张五", "李善长", "林青霞", "李寻欢")
//    找到第一个姓张的

    val result = list.find {
        it.startsWith("张")
    }
    println(result)

//     把第一个集合中所有姓张的找出来

    val list1 = list.filter {
        it.startsWith("张")
    }
    println(list1)
//     把两个集合中所有姓张的找到并存放在同一个集合中

    val mutableList = mutableListOf<String>()

    val filterTo = list.filterTo(mutableList) {
        it.startsWith("张")
    }

    val filterTo1 = list2.filterTo(mutableList, {
        it.startsWith("张")
    })

    println(filterTo1)
    
//    把第一个集合中角标为偶数的元素找出来
    val filterIndexed = list.filterIndexed { index, s ->
        index % 2 == 0
    }

    println(filterIndexed)

}