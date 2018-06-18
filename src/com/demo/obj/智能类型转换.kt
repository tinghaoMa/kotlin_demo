package com.demo.obj

/**
 * 职能类型转换
 */
fun main(args: Array<String>) {

    val bigDog: Dog = BigDog()
    if (bigDog is BigDog) { //判断完类型之后 已经把bigDog 转换为BigDog
        bigDog.lookDoor()
    }
//
//    val smallDog = SmallDog()
//    smallDog.maiMeng()

}

open class Dog

class BigDog : Dog() {

    fun lookDoor() {

        println("大型犬负责看家")
    }

}


class SmallDog : Dog() {
    fun maiMeng() {
        println("小型犬负责卖萌")
    }
}