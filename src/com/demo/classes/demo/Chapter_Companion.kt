/**
 * 伴生对象
 * 类内部的对象声明可以用 companion 关键字标记
 *
 * https://www.kotlincn.net/docs/reference/object-declarations.html#%E4%BC%B4%E7%94%9F%E5%AF%B9%E8%B1%A1
 */
package com.demo.classes.demo

class MyClass {

    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

//该伴生对象的成员可通过只使用类名作为限定符来调用：
val instance = MyClass.create()



class MyClass2 {
    companion object {
    }
}

//可以省略伴生对象的名称，在这种情况下将使用名称 Companion
val x = MyClass2.Companion


/**
 * 即使伴生对象的成员看起来像其他语言的静态成员，在运行时他们仍然是真实对象的实例成员，
 * 而且，例如还可以实现接口
 */

interface Factory<T> {
    fun create(): T
}


class MyClass3 {
    companion object : Factory<MyClass3> {
        override fun create(): MyClass3 = MyClass3()
    }
}

var class3 =MyClass3.create()


fun main(args: Array<String>) {
    println(instance)
    println(x)
    println(class3)
}
