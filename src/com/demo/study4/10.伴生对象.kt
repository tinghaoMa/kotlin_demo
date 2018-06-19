package com.demo.study4.r

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 11:28 AM
 * @class describe
 *
 * 伴生对象  companion object 控制属性的静态 只能放到普通类里面
 */

fun main(args: Array<String>) {
    val p = Person()
    println(p.age)

    println(Person.name) //类名访问
}

class Person {
    var age = 20

    companion object {
        var name: String = "李四"
    }

}
