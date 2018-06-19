package com.demo.study5

/**
 * @class name：com.demo.study5
 * @author itck_mth
 * @time 2018/6/19 10:29 PM
 * @class describe
 */


fun main(args: Array<String>) {
    val list: ArrayList<String> = arrayListOf("张三", "李四", "王二麻")
//    list?.add("范冰冰")
//    list?.add("李晨")
//    list?.add("邓超")

    set {
        println(name)
    }
    /******************************apply******************************/
    //跟上面对比这种方式更好一些
    /**
     * 任意类型都有apply函数
     * apply参数是一个函数 T.()->Unit 带接受者的函数字面值
     * lambda表达式里面的this代表调用的对象
     * 在lambda表达式里面可以访问对象的方法和变量
     */
    val apply = list?.apply {
        add("王者荣耀")
        add("桌球")
        add("坦克大战僵尸")
    }

//    apply?.forEach {
//        println(it)
//    }
    /*******************************let*******************************/
    /**
     * 任意对象都有let扩展函数
     * let函数参数也是一个函数
     * 函数参数他的参数是调用者本身
     * let函数返回的值是参数函数的返回值 就是lambda表达式的返回值
     */
    list?.let {
        it.add("变形金刚")
        it.add("侏罗纪公园")
    }
//
//    list?.forEach {
//        println(it)
//    }

    /*******************************with*******************************/

    /**
     * with是独立的函数
     * with函数参数需要接收两个参数
     * 第一个参数可以接收任意类型
     * 第二个参数是函数参数 并且这个函数参数是带这个函数接受者的字面值 接收者就是第一个参数
     * with函数返回值是第二个函数参数的返回值
     * 相当于let和apply的结合体
     */
    with(list

    ) {
        add("双王")
        add("四带二")
    }

    list.forEach {
        println(it)
    }

    /*******************************run*******************************/
    /**
     * 任意类型都有run扩展函数
     * run函数是待接收者的函数，接受者是调用者本身
     * run函数返回的是函数参数的返回值
     *
     */
    list.run {
        this.add("哈哈")
        "哈哈" //函数参数返回值是什么 run的返回值就是什么
    }.length

}

/**
 * T.()->Unit
 * 两种执行方法：
 *  1.Data().block() 2.block(Data())
 */
fun set(block: Data.() -> Unit) {

//    Data().block()

    block(Data())
}


class Data {
    var name = "帅哥"
}