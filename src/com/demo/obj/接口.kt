package com.demo.obj

fun main(args: Array<String>) {
    val xiaoMing = XiaoMing()
    xiaoMing.ride()
    xiaoMing.driveCar()
}

class XiaoMing : ZHHuman(), RideBike, DriveCar {
    override var license: String = "123123123"

//    override fun driveCar() {
//        println("小明会开汽车 他的驾照号码是 ： " + this.license)
//    }

    override fun ride() {
        println("小明会骑自行车")
    }
}


/**
 * 接口是反应事物的能力(事物的行为) 可以多实现
 */
interface RideBike {
    fun ride()
}


interface DriveCar {

    var license: String //不能直接初始化 但是java可以
    /**
     * java 接口里面函数不准有方法体 但是kotlin可以有，子类可以不复写该方法
     */
    fun driveCar() {
        println("挂挡 踩油门 出发 驾照号码是 :" + this.license)
    }
}
