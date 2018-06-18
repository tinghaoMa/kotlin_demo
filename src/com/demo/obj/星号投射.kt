package com.demo.obj

/**
 * 星号投射
 *
 *
 *      *号可以传递任意类型  相当于java 的 ？
 */
fun main(args: Array<String>) {
    val list = ArrayList<String>()
    setFruitList(list)


}

//现在想让ArrayList 里面可以接受任意类型怎么办
fun setFruitList(list: ArrayList<*>) {
    println(list.size)
}