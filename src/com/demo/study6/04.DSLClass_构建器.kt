package com.demo.study6.dsl.g

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
 *
 * DSL只是解决问题的外部封装  ， DSL更易于理解
 *
 * 问题：字段可以多次赋值，需要只能赋值一次
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
fun person(block: PersonBuilder.() -> Unit): Person {
    val builder = PersonBuilder()
    block.invoke(builder)
    return builder.build()
}

//扩展函数
fun PersonBuilder.address(block: Address.() -> Unit) {
//    val address = Address()
//    block.invoke(address)
//    this.address = address

    this.address = Address().apply(block)
}


data class Address(var city: String? = null, var street: String? = null, var number: Int = 0)

class Person() {
    var name: String? = null
        private set
    var age: Int = 0
        private set
    var address: Address? = null
        private set

    constructor(name: String?, age: Int, address: Address?) : this() {
        this.name = name
        this.address = address
        this.age = age
    }


    override fun toString(): String {
        return "$name     $age    $address"
    }
}


class PersonBuilder {
    var name: String? = null
    var age: Int = 0
    var address: Address? = null

    fun build(): Person {
        return Person(name, age, address)
    }

}