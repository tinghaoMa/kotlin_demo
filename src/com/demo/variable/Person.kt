/**
 * 字段属性
 */
package com.demo.variable

/**
 *  编译期常量
    已知值的属性可以使用 const 修饰符标记为 编译期常量。
    这些属性需要满足以下要求：
        位于顶层或者是 object 的一个成员
        用 String 或原生类型 值初始化
        没有自定义 getter
 */
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"


class Address {


    //幕后字段 field
    var address: String = ""
//        get() = "hello"
        set(value) {
            field = value.toUpperCase()
        }
    var name: String = "abc"
        private set // 此 setter 是私有的并且有默认实现

    //幕后属性
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // 类型参数已推断出
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }


    override fun toString(): String {
        return "Address(address='$address', name='$name')"
    }
}


fun copyAddress(address: Address): Address {
    val result = Address() // Kotlin 中没有“new”关键字
//    result.name = address.name // 将调用访问器
    result.address = address.address // 将调用访问器
    return result
}


fun main(args: Array<String>) {
    var a = Address()
    a.address = "a address"
//    a.name = "a name"
    println(a.toString())

    println("copy---${copyAddress(a)}")
}

