import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

/**
 * @class name：
 * @author itck_mth
 * @time 2018/6/24 09:35
 * @class describe
 *
 * 1.launch函数没有返回值
 * 2.async 函数有返回值
 *
 *
 */

fun main(args: Array<String>) = runBlocking {
    /*******************************async执行的协程有返回值*******************************/
    //Deferred是job的子类
    val result = async {
        getStr()
    }
    println("获取到的返回值${result.await()}")

}

suspend fun getStr(): String {
    println("getStr 开始执行")
    delay(2000)
    println("getStr 执行结束")
    return "hello world"

}