package com.demo.obj.c

/**
 * 泛型上限
 *
 *
 * T : Fruit 泛型上限 泛型只能是Fruit或者是其子类
 */
fun main(args: Array<String>) {
    val thing = Thing()
    val apple = Apple()

    val fruit = Fruit()

    val box = FruitBox(apple)
    val box2 = FruitBox(fruit)

//    val box1 = FruitBox(thing)


}


open class Box<T>(var thing: T)


//水果箱子
class FruitBox<T : Fruit>(thing: T) : Box<T>(thing)


open class Thing

//水果
open class Fruit : Thing()

class Apple : Fruit()

class Oriange : Fruit()

