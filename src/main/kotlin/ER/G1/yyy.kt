package ER.G1

import kotlin.random.Random

fun win(obj: Any) = obj

fun yyy(): Any {
    val n: Int = Random.nextInt()
    val obj = win(n) // boxing
    val p = obj as Int? // checkCast
    val res = p!!   // maybe unboxing and checkNull 🥲
    return res + n.hashCode()   // boxing and unboxing holy shit
}