package com.demo.study4.a

/**
 *
 */
fun main(args: Array<String>) {

    val server = Servicer()
    val father = SmallHeadFather(server)
    //实际上是委托大头儿子洗碗
    father.washPower()
}

/**
 * 洗碗
 */
interface WashPower {
    fun washPower()
}


class BitHeadSon : WashPower {
    override fun washPower() {
        println("大头儿子开始洗碗了。。。")
    }
}

class Servicer : WashPower {
    override fun washPower() {
        println("我是洗碗工服务员 开始洗碗")
    }

}

//委托给任意一个具备洗碗能力的人
class SmallHeadFather(var washPower: WashPower) : WashPower by washPower