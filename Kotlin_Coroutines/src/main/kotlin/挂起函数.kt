import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * @class name：
 * @author itck_mth
 * @time 2018/6/24 09:04
 * @class describe
 *
 * 挂起函数：可以被挂起执行，到时间之后从线程池空闲线程中恢复执行
 * 挂起函数必须通过suspend声明
 * 挂起函数必须在协程函数中执行，或者在其他挂起函数中执行
 *
 *
 * 非阻塞的意思就是 一开始如果是线程1在执行 发现被挂起，之后一段时间如果在执行可能是其他线程
 *
 */
//必须声明runBlocking 这个是主协程 
fun main(args: Array<String>) = runBlocking {

    val job = launch {

        myTask()
    }
    //join方法也是挂起函数
    job.join()


}


suspend fun myTask() {

    println("执行前")
    //非阻塞 ，如果需要阻塞 那么使用Thread.sleep(2000)
    delay(2000)

    println("执行后")

}