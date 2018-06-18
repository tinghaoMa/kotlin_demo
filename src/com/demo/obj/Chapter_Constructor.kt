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

/**
 * 直接在构造字段前面加 var或者val
 *
 * 如果是val的话 相当于隐藏该属性的set方法,不能赋值
 */
class Person(val name: String, var age: Int) {

}


//class Person(name:String,age:Int){ //创建的时候就需要修改name和age
//
//    var name=""
//    var age=0
//    init {  //构造函数里面的代码可以放到init里面执行
//        this.name=name
//        this.age = age
//    }
//
//}


//class Person{
//    var name="张三"
//    var age = 20
//}