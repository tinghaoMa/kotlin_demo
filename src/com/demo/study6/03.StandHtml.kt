package com.demo.study6


/**
 * @class name：com.demo.study6
 * @author itck_mth
 * @time 2018/6/20 3:36 PM
 * @class describe
 */

fun main(args: Array<String>) {
//    val html = HTML()
//    val head = HEAD()
//    html.setTag(head)
//    val title = TITLE()
//    head.setTag(title)
//    val body = BODY()
//    html.setTag(body)
//    val div = DIV()
//    body.setTag(div)
//    println(html)


    val result = html {
        head {

            title{

            }

        }
        body {
            div {
//                body { //可以访问最外面的HTML作用域 严格限制这个作用域
//
//                }
            }
        }
    }

    println(result)

}

fun HEAD.title(function: () -> Unit) {
    val title = TITLE()
    setTag(title)
}

fun BODY.div(block: () -> Unit) {
    val div = DIV()
    setTag(div)
}

fun html(block: HTML.() -> Unit): HTML {
    val html = HTML()
    block.invoke(html)
    return html
}

fun HTML.head(block: HEAD.() -> Unit) {
    val head = HEAD()
    setTag(head)
    block.invoke(head)
}


fun HTML.body(block: BODY.() -> Unit) {
    val body = BODY()
    setTag(body)
    block.invoke(body)
}


//HTML标签
class HTML : Tag("html")

class HEAD : Tag("head")
class BODY : Tag("body")
class TITLE : Tag("title")
class DIV : Tag("div")


@MYTAG
open class Tag(var name: String) {
    val list = mutableListOf<Tag>()

    fun setTag(tag: Tag) {
        list.add(tag)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("<$name>")
        list.forEach {
            sb.append(it.toString())
        }
        sb.append("</$name>")
        return sb.toString()
    }
}

/**
 * 缩小作用于  定义一个注解 给要缩小作用于的class 加上该注解就可以
 */

@DslMarker
annotation class MYTAG