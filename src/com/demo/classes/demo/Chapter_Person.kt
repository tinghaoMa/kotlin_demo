/**
 * https://www.kotlincn.net/docs/reference/classes.html#%E7%B1%BB%E5%92%8C%E7%BB%A7%E6%89%BF
 */
package com.demo.classes.demo

open class Person(private  var name:String) {

    private var age: Int

    init {
        name="default"
        age = 20
    }


    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

class Teacher(name:String,city:String):Person(name){


}



fun main(args: Array<String>) {
    var p = Person("smallegg", 33)
    println(p.toString())
}