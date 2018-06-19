package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 10:29 PM
 * @class describe
 */


fun main(args: Array<String>) {
    val list: ArrayList<String>? = arrayListOf("张三", "李四", "王二麻")
//    list?.add("范冰冰")
//    list?.add("李晨")
//    list?.add("邓超")

    set {
        println(name)
    }

    println("/************************apply************************/")
    //跟上面对比这种方式更好一些
    val apply = list?.apply {
        add("王者荣耀")
        add("桌球")
        add("坦克大战僵尸")
    }

    apply?.forEach {
        println(it)
    }
}

/**
 * T.()->Unit
 * 两种执行方法：
 *  1.Data().block() 2.block(Data())
 */
fun set(block: Data.() -> Unit) {

//    Data().block()

    block(Data())
}


class Data {
    var name = "帅哥"
}