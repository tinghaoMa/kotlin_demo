package com.demo.study6.dsl

/**
 * @class name：com.demo.study6
 * @author itck_mth
 * @time 2018/6/20 2:54 PM
 * @class describe
 *
 * 从外层往里层推进
 *
 */

fun main(args: Array<String>) {

    val person = person {
        name = "张三"
        age = 10
        address = address {
            city = "北京"
            street = "中关村融科"
            number = 100
        }
    }

    println(person)
}


fun person(block: Person.() -> Unit): Person {
    val person = Person()
    block(person)  //执行block函数
//    block.invoke(person)
    return person
}

fun address(block: Address.() -> Unit): Address {
    val address = Address()
    block.invoke(address)
    return address
}


data class Address(var city: String? = null, var street: String? = null, var number: Int = 0)

data class Person(var name: String? = null, var age: Int = 0, var address: Address? = null)