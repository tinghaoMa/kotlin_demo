/**
 * 覆盖方法
 * https://www.kotlincn.net/docs/reference/classes.html#%E8%A6%86%E7%9B%96%E6%96%B9%E6%B3%95
 */
package com.demo.classes.demo


open class BaseActivity {
    open fun onCreate() {
        println("111111")
    }
}

class HomeActivity : BaseActivity() {

    override fun onCreate() {
        super.onCreate()
        println("2222222")
    }
}

fun main(args: Array<String>) {
    var activity = HomeActivity()
    activity.onCreate()
}