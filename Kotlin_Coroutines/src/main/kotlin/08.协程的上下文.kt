import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.coroutineContext

/**
 * @class name：
 * @author itck_mth
 * @time 2018/6/24 09:43
 * @class describe
 */

fun main(args: Array<String>) = runBlocking {
    println("主线程开始执行")

    val job = launch {
        //第一个参数CoroutineContext 就是上下文 指定协程代码在哪个线程池中执行
        //默认是通过Commpool实现
        println("hello world 1111")
    }


    val job1 = launch(CommonPool) {
        println("hello world 22222")
    }

    val job2 = launch(Unconfined) {
        //运行在主线程中
        println("hello world 33333")
    }

    val job3 = launch(coroutineContext) {
        //运行在父协程的上下文中
        println("job3 hello world    " + Thread.currentThread().name)
    }

    val job4 = launch(newFixedThreadPoolContext(5, "新线程")) {
        println("job4 hello world    " + Thread.currentThread().name)
    }

    println("主线程结束执行")
}