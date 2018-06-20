package com.demo.study5.函数回调

/**
 * @class name：com.demo.study5.函数回调
 * @author itck_mth
 * @time 2018/6/20 12:56 PM
 * @class describe 超市
 */

class SuperMarket {

    /**
     * 买酱油 高阶函数 函数作为参数回调
     */
    fun buySoy(block: ((Soy) -> Unit)?) {
        Thread {
            Thread.sleep(5000)
            val soy = Soy("海天")
            //返回 soy
            block?.invoke(soy)
        }.start()
    }
}