package ER.G1

import ER.Check

class Account {
    var age: Int = 17

    @Check(valid = "nonNegative")
    var balance: Long = 0

    @Check(valid = "dotCom")
    lateinit var email: String

    fun nonNegative(v: Long) = v > 0
    fun dotCom(address: String) = address.endsWith(".com")
}