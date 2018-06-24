import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.withTimeout

/**
 * @class name：
 * @author itck_mth
 * @time 2018/6/24 09:22
 * @class describe
 */

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        withTimeout(2000,{
            (1..10).forEach {
                println("打印$it")
                delay(1000)
            }
        })
    }

    job.join()
}