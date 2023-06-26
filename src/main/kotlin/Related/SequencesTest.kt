package Related

fun seq1() = sequence {
    println("0")
    yield("ISEL")
    println("1")
    yield("LEIC")
    println("2")
    yield("LAE")
}

fun seq2() = sequence {
    yield("ISEL")
    yield("LEIC")
    yield("LAE")
    println("ola")
}
