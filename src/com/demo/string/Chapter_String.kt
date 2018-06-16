/**
 * 字符串
 *
 *
 */
package com.demo.string

fun main(args: Array<String>) {
    val i = 10
    log("i = $i") // 输出“i = 10”

    //花括号括起来的任意表达式:
    val s = "abc"
    log("$s.length is ${s.length}") // 输出“abc.length is 3”

    //如果你需要在原始字符串中表示字面值 $ 字符（它不支持反斜杠转义），你可以用下列语法：
    val price = """${'$'}9.99"""

    log("price = $price")

    //输出包含空格  trimIndent 可以隐藏空格
    var str1 = """

        |a
        |b
        |c

    """
    log(str1)

    //原样输出
    val str2 = """
        hello
        world,
        I
        am
        coming
    """.trimIndent()

    log(str2)

    //trimMargin 删除|
    val str3 = """
        |a
        |b
        |c
    """.trimMargin("|")

    log(str3)

    //equals  ==  ===
    val str4: String = "abc"

    val str5: String = String(charArrayOf('a', 'b', 'c'))
    //比较值
    println(str4.equals(str5))
    println(str4 == str5)
    //比较地址
    println(str4 === str5)

    //split 截取
    val str6 = "a.b.c-e"
    val split = str6.split('.', '-')

    println(split)

    val content = "/Users/itck_mth/study/rvideos/kotlin/"
    //获取前6个字符
    val substringBefore = content.substring(0, 6)
    log(substringBefore)
    //把第一个r之前的字符截取
    val substringBefore1 = content.substringBefore('r')
    log(substringBefore1)
    //把最后一个r之前的字符截取
    val substringAfter = content.substringBeforeLast('r')
    log(substringAfter)
    //把第一个r之后的字符截取
    val substringAfter1 = content.substringAfter("r")
    log(substringAfter1)
    //把最后一个r之后的字符截取
    val substringAfterLast = content.substringAfterLast('r')
    log(substringAfterLast)
}


fun log(log: String) {
    println(log)
}