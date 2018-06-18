package com.demo.obj

/**
 * 构造函数
 *
 *
 */
fun main(args: Array<String>) {
    val p = Person("李四", 30)

    println(p.name)
    println(p.age)

}

class Person(name:String,age:Int){ //创建的时候就需要修改name和age

    var name=""
    var age=0
    init {  //构造函数里面的代码可以放到init里面执行
        this.name=name
        this.age = age
    }

}




//class Person{
//    var name="张三"
//    var age = 20
//}