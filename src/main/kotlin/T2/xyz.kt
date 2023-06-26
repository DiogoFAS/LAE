package T2

class X(bar: Int) {
    val nr: Int get() = foo
    companion object {
        val foo = 7657
        val zaz = 1234
        val qux = 9876
    }
}

class Y(var bar: Int = 7657, qux: String = "ISEL-LEIC") {
    val nr
        get() = bar
    val foo
        get() = nr
}

class Z(
    val bar: Int,
    val foo: Int
)