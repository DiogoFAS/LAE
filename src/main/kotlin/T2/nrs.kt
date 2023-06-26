package T2

fun main() {
    val nrs = arrayOf("abc", "def", "super").map { print("$it "); it.length }
    println(nrs.distinct().count()) // 2
    println(nrs.count()) // 3
}

// abc def super 2 => sequenceOf(3, 3, 5)
// 3 3 5 3