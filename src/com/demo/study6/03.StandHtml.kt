package com.demo.study6


/**
 * @class name：com.demo.study6
 * @author itck_mth
 * @time 2018/6/20 3:36 PM
 * @class describe
 */

fun main(args: Array<String>) {
    val html = HTML()
    val head = HEAD()
    html.setTag(head)
    val title = TITLE()
    head.setTag(title)
    val body = BODY()
    html.setTag(body)
    val div = DIV()
    body.setTag(div)
    println(html)

}

//HTML标签
class HTML : Tag("html")
class HEAD : Tag("head")
class BODY : Tag("body")
class TITLE : Tag("title")
class DIV : Tag("div")


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