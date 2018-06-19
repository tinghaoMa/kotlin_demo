package com.demo.study4.f

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 11:00 AM
 * @class describe
 */

fun main(args: Array<String>) {
    val name: String? = null

    val message = name.myIsEmpty()
    println(message)


    val son = Son()
    son.sayHello()
}

/**
 * 扩展函数
 *
 * 1.String类扩展函数fun String.扩展函数名
 * 2.扩展函数可以访问当前对象里面的字段和方法
 *
 * 扩展可空类型的对象使用 ?
 */
fun String?.myIsEmpty(): Boolean {
    return this == null || this.isEmpty()
}


open class Father {
    open fun haha() { //内部方法子类可以复写

    }
}

class Son : Father() {
    override fun haha() {

    }

}

/**
 * 扩展方法 子类不可以复写
 */
fun Father.sayHello() {
    println("father say hello ")

}


