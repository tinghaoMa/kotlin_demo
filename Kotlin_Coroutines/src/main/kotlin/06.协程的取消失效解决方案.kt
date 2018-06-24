import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * @class name：
 * @author itck_mth
 * @time 2018/6/24 09:30
 * @class describe
 */

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        //可以通过状态isActive来取消

        (1..10).forEach {
            if (!isActive) {
                return@launch
            }
            println("打印$it")
//            delay(1000)
            Thread.sleep(1000)
        }
    }
    //等待2秒钟之后 取消协程
    delay(2000)
    //只能取消挂起的，不能取消Thread.sleep
    //因为挂起的 取消是 线程再也不去了，但是阻塞的Thead.sleep 线程一直都在 根本就不存在回不回来
    //可以这么去理解
    println("取消之前的状态 ${job.isActive}")

    job.cancel()

    println("取消之后的状态 ${job.isActive}")

    job.join()
}