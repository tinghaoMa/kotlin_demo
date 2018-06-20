package com.demo.study5.函数回调

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/20 11:35 AM
 * @class describe
 *
 * 对java来说 函数必须存在于对象中，虽然只需要这个函数，但是必须要通过对象包裹来调用
 *
 * kotlin里面 函数可以单独存在 可以直接通过函数来进行回调
 *
 *
 */

fun main(args: Array<String>) {
    //超市对象
    val market = SuperMarket()
//
//    market.buySoy {
//        println("买回来牌子是${it.name}的酱油")
//        println("妈妈开始做菜了")
//    }
    market.buySoy(null)

    println("妈妈先做甜点")


}