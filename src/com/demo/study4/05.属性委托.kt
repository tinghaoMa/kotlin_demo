package com.demo.study4

import kotlin.reflect.KProperty

/**
 * @class name：com.demo.study4
 * @anthor itck_mth
 * @time 2018/6/19 10:26 AM
 * @class describe 属性委托
 */

fun main(args: Array<String>) {

    val son = Son()
    //存入了100块钱
    son.money = 100
    //取钱
    println(son.money)

        
}

class Son {
    //将自己的钱委托给妈妈
    var money: Int by Monther()
}

class Monther {
    operator fun getValue(son: Son, property: KProperty<*>): Int {
        return sonMoney
    }

    //i 就是儿子设置的压岁钱
    operator fun setValue(son: Son, property: KProperty<*>, i: Int) {
        selfMoney += i - 50
        sonMoney += 50
    }

    var sonMoney = 0
    var selfMoney = 0


}