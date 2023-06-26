package ER.G2

fun boom(s: String, obj: Any, n: Int): Int {
    return (s.length / obj.hashCode()) - n
}