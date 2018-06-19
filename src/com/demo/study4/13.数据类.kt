package com.demo.study4

/**
 * @class name：com.demo.study4
 * @author itck_mth
 * @time 2018/6/19 1:08 PM
 * @class describe
 */

fun main(args: Array<String>) {

    val news = News("标题", "内容", "简介", "路径")
    println(news.title)
    println(news.component1())

    //解构
    val (title, content, dec, imgPath) = News("标题", "内容", "简介", "路径")

    println(title)
    println(content)

}

//加上关键字 data之后就是数据类
data class News(var title: String, var content: String, var dec: String, var imgPath: String)