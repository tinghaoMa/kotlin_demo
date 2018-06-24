import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * @class name：
 * @author itck_mth
 * @time 2018/6/24 07:57
 * @class describe
 *
 * Kitlin 协程
 * 默认是守护线程 ForJoinPool
 *
 *
 */

fun main(args: Array<String>) = runBlocking {
    println("主线程开始执行")

    val job = launch {
        (1..100).forEach {
            println(it)
            Thread.sleep(10)
        }
    }
    job.join()
    println("主线程结束执行")

}