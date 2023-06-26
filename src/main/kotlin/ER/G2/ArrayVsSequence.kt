package ER.G2

fun main() {
    print("Array: ")
    arrayOf("abc", "isel", "super")
            .map {
                print("$it ") // abc isel super
                it.length
            }
            .filter {
                print("$it ") // 3 4 5
                it == 4
            }
            .first()
    print("Sequence: ")
    sequenceOf("abc", "isel", "super")
            .map {
                print("$it ")
                it.length
            }
            .filter {
                print("$it ")
                it == 4
            }
            .first()
}