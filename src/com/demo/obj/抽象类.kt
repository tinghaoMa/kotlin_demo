package com.demo.obj

fun main(args: Array<String>) {

    val zhhuman = ZHHuman()
    zhhuman.ball()
    zhhuman.eat()

    val usHuman = UsHuman()
    usHuman.eat()
    usHuman.ball()
}

/**
 * 抽象类 可以含有非抽象的字段和方法
 *
 * 抽象类不需要open关键字
 */
abstract class Human {
    abstract var color: String
    abstract var language: String
    abstract fun eat()

    open fun ball() {
        println("世界杯玩足球")
    }
}


class ZHHuman : Human() {
    override var color: String = "黄色"
    override var language: String = "中文"

    override fun eat() {
        println("吃饭用筷子")
    }

    override fun ball() {
        println("足球傻子")
    }

}


class UsHuman : Human() {
    override var color: String = "白色"
    override var language: String = "English"

    override fun eat() {
        println("吃饭用刀叉")
    }
}