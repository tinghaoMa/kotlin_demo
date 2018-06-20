package com.demo.study6

import java.util.*

/**
 * @class name：com.demo.study6
 * @author itck_mth
 * @time 2018/6/20 21:49
 * @class describe
 */

fun main(args: Array<String>) {
//    val util = HttpUtil()
//    util.sendRequest("http://www.baidu.com", "GET", onSucess = {
//        println("$it")
//    }, onError = {
//        println("$it")
//    })


    http {
        url = "http://www.baidu.com"
        method = "GET"
        onSucess {
            println("成功了 哈哈哈哈 ")
        }

        onError {
            println("失败了 亚麻跌")
        }

    }
}

fun RequestBuilder.onError(block: (String) -> Unit) {
    this.onError = block
}

fun RequestBuilder.onSucess(block: (String) -> Unit) {
    this.onSucess = block
}


fun http(block: RequestBuilder.() -> Unit) {
    val builder = RequestBuilder()
    block.invoke(builder)
    builder.sendRequest()
}

class RequestBuilder(var url: String? = null, var method: String? = null,
                     var onSucess: ((String) -> Unit)? = null, var onError: ((String) -> Unit)? = null) {

    fun sendRequest() {
        val httpUtil = HttpUtil()
        httpUtil.sendRequest(url, method, onSucess, onError)
    }

}


class HttpUtil {


    fun sendRequest(url: String?, method: String?,
                    onSucess: ((String) -> Unit)? = null, onError: ((String) -> Unit)? = null) {
        Thread {

            println("建立连接 请求数据")
            Thread.sleep(1000)

            val random = Random().nextInt()

            if (random % 2 == 0) {
                onSucess?.invoke("请求成功了")
            } else {
                onError?.invoke("请求失败了")
            }

        }.start()
    }
}