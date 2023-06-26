package T1

class Foo(a: Int, var b: String, val c: Int, d: Double) {
    val x : String = "ISEL"
    var y : Int = 2022

    fun ola(): String {
        return x + b
    }

    fun ola2(): Double {
        return 2.0
    }

    fun ola2(r: Int, k: Float): Double {
        return (r + k.toInt()).toDouble()
    }
}
// memberProperties são as variáveis que são declaradas dentro de uma classe mas fora dos métodos
