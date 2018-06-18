package com.demo.obj

/**
 * 泛型
 * 在强类型程序设计语言中编写代码时定义的一些可变的部分
 *
 *
 * 定义子类的时候使用泛型
 * 定义子类的时候不知道具体类型 继续泛型
 */
fun main(args: Array<String>) {
    val box = Box<String>("hello world")
    println(box.thing)

}


open class Box<T>(var thing: T)


//水果箱子
class FruitBox(thing: Fruit) : Box<Fruit>(thing)

//不知道放什么继续使用泛型
class SonBox<T>(thing: T) : Box<T>(thing)


//水果
abstract class Fruit

class Apple : Fruit()

class Oriange : Fruit()

