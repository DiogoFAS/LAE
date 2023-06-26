package EN.G1

class Pack(val v: Any)
// public class Pack(Object v)

fun bar(): Int {
    val n = 6235
    val p = Pack(n) // boxing to convert a primitive int to object Integer.
    val res = p.v as Int? // checkCast to verify if v is an instance of Integer.
    return res ?: 0 // Unboxing to convert v Integer to Int.
}