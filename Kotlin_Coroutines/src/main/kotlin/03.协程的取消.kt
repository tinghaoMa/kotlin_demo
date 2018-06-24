import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * @class name：
 * @author itck_mth
 * @time 2018/6/24 09:18
 * @class describe
 */

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        (1..10).forEach {
            println("打印$it")
            delay(1000)
        }
    }
    //等待2秒钟之后 取消协程
    delay(2000)
    job.cancel()

    job.join()
}