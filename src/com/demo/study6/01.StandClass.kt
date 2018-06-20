package com.demo.study6

/**
 * @class name：com.demo.study6
 * @author itck_mth
 * @time 2018/6/20 2:48 PM
 * @class describe
 */

fun main(args: Array<String>) {

//    var address = Address("北京", "中关村融科", 10)
//    var person = Person("张三", 20, address)
//    var address = Address("北京", "中关村融科", 10)
//    var person = Person("张三", 20, address)
//    var address = Address("北京", "中关村融科", 10)
//    var person = Person("张三", 20, address)

//最好按下面的方式 简单
//    person{
//        name="张三"
//        age=20
//        address{
//            city="北京"
//            street="海淀中关村"
//            num=10
//        }
//    }


}

class Address(var city: String, var street: String, var number: Int)

class Person(var name: String, var age: Int, var address: Address)