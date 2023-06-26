package T2

fun hot() {
    val other: Int?
    val n = 6545
    other = n // boxing
    val res = n.equals("ola") // Boxing
    val end = other + res as Int // checkCast
}

fun hot1(input: Boolean) {
    val other: Int
    val n: Int? = if(input) 1 else null // Boxing => Integer.valueOf(6545) <=> new Integer(6545)
    other = n!! // Unboxing => Integer.intValue() and checkCast
    val res = n.equals("ola")
    val end = other + res as Int
}
