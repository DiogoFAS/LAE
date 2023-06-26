package EN.G1

interface Adjustable { fun adjust(diff : Int) }

class Light(private var intensity : Int) : Adjustable {
    override fun adjust(diff : Int) { intensity += diff; update() }
    private fun update() {}

    companion object Test {
        val s = "ABC"
    }
}

val DIMMED = 15

fun createLight(intensity: Int = DIMMED) = Light(intensity)
