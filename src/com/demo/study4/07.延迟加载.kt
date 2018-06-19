package com.demo.study4.e

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 10:47 AM
 * @class
 *
 * lateinit  延迟加载用的时候 才赋值，不用不赋值
 */

fun main(args: Array<String>) {
    val p = Person()
    p.name = "李四"
    println(p.name)
}


class Person {
    //name 不确定 后面可能用的时候才会赋值  不知道具体赋什么值
    lateinit var name: String

}