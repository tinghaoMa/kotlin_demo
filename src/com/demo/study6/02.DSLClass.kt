package com.demo.study6.dsl

/**
 * @class name：com.demo.study6
 * @author itck_mth
 * @time 2018/6/20 2:54 PM
 * @class describe
 *
 * 从外层往里层推进
 *
 *
 * Person.() -> Unit 相当于在Person class 里面定义了一个函数 所以可以访问Person类里面的字段和方法
 *
 */

fun main(args: Array<String>) {

    val person = person {
        name = "张三"
        age = 10
        address {
            city = "北京"
            street = "融科"
            number = 10
        }
    }
    println(person)
}

//Person 域传递
fun person(block: Person.() -> Unit): Person {
    val person = Person()
    block(person)  //执行block函数
//    block.invoke(person)
    return person
}

//扩展函数
fun Person.address(block: Address.() -> Unit) {
    val address = Address()
    block.invoke(address)
    this.address = address
}


data class Address(var city: String? = null, var street: String? = null, var number: Int = 0)

data class Person(var name: String? = null, var age: Int = 0, var address: Address? = null)