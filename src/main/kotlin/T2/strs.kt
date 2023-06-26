package T2

fun main() {
    val strs = mutableListOf("ISEL", "LEIC", "LAE")
    (strs as Array<Int>)[2] = 5
    //(strs as MutableList<Int>).add(5) // está é a correta
    strs.forEach{ println("$it: ${it!!.javaClass.simpleName}") }
}