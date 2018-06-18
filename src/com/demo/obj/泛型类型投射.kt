package com.demo.obj.kk

/**
 * 泛型类型投射
 *
 * out :接受当前类型或者子类 相当于java ? extands
 *
 * in :接受当前类型或者父类 相当于java ? super
 *
 */
fun main(args: Array<String>) {

//    val list = ArrayList<Fruit>()
//    setFruitList(list)
//
//    val list1 = ArrayList<Apple>()
//    setFruitList(list1)

    val list1 = ArrayList<Thing>()
    setFruitList(list1)


}


fun setFruitList(list: ArrayList<in Fruit>) {


}


open class Box<T>(var thing: T)


abstract class Thing
//水果
abstract class Fruit : Thing()

class Apple : Fruit()

class Oriange : Fruit()