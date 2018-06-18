package com.demo.obj

/**
 * 继承
 */
fun main(args: Array<String>) {
    val f = Father()
    f.hobby()
    val son = Son()
    son.hobby()


    var f1 = Father()
    f1 = Son()
    f1.hobby()
}

/**
 * Kotlin类默认都是final的 默认不能被继承
 */
open class Father {
    open var name = "张三"
    open var age = 50

    open fun hobby() {
        println("父亲喜欢喝酒")
    }
}


class Son : Father() {
    override var name: String = "张四"
    override var age: Int = 20

    override fun hobby() {
        println("孩子喜欢看世界杯")
    }

}