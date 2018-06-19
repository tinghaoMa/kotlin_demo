package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 2:21 PM
 * @class 集合
 */

fun main(args: Array<String>) {

    /***************************listOf********************************/
    //不能添加 不能修改 只读List集合
    val list = listOf<String>("a", "b", "c")
    list.forEach {
        println(it)
    }


    /***************************mutableListOf********************************/
    val list1 = mutableListOf("a", "b", "c")
    list1.add("d")
    list1.add(0, "e")
    list1.forEach {
        println(it)
    }

    /***************************java集合********************************/
    val list2 = arrayListOf("a", "b", "c")
    val list3 = ArrayList<String>()



    /***************************filter********************************/

    val girls = listOf<Girl>(
            Girl("小花", 20, "北京"),
            Girl("大花", 30, "大连"),
            Girl("小丽", 22, "大连"),
            Girl("小牧", 31, "上海"))


    val dlGirls = girls.filter {
        it.place == "大连"
    }

    println(dlGirls)


}

data class Girl(var name: String, var age: Int, var place: String)