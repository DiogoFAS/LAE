package ER.G1

class A1() {
    fun foo() = 123456
    val nr
        get() = 7658894
    val foo
        get() = nr
}


class B1(val bar: Int, val foo: Int)

class C1(val bar: Int) {
    val nr: Int
        get() = bar
    fun foo() = nr
    fun oper(num: Int) : Int {
        val x = num + 1
        val y = num - 1
        return x * y
    }
}
