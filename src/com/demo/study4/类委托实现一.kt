package com.demo.study4

/**
 * 类委托
 * 这种方式局限性比较大
 */
fun main(args: Array<String>) {
    val father = SmallHeadFather()
    //实际上是委托大头儿子洗碗
    father.washPower()
}

interface WashPower {
    fun washPower()
}


class BitHeadSon : WashPower {
    override fun washPower() {
        println("大头儿子开始洗碗了。。。")
    }
}

//委托给儿子
class SmallHeadFather : WashPower by BitHeadSon()