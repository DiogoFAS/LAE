package ER.G1

import kotlin.math.max

val e = 2.718281828
val pi = 3.141592654

enum class data {
    OLA, ADEUS
}

data class C(val str: String) {
}

interface F { fun op(arg : Double) : Double }

object Stats { var maxOffset = 0.0 }

class A(val str: String) : F {
    private inner class ola {

    }

    override fun op(arg : Double) : Double { TODO() }
    companion object {

    }
}

class B(private val offset : Double) : F {
    init { Stats.maxOffset = max(Stats.maxOffset, offset) }
    override fun op(arg : Double) : Double { TODO() }
}