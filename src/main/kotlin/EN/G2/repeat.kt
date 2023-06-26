package EN.G2

/* val it = this@repeat.iterator()
        while (it.hasNext()) {
            val curr = it.next()
            var count = 0
            while (count < times) {
                count++
                yield(curr)
            }
        }
*/

fun <T : Any> Sequence<T>.repeat(times: Int): Sequence<T> {
    return sequence {
        for(item in this@repeat) {
            var count = 0
            while(count < times) {
                count++
                println(item)
                yield(item)
            }
        }
    }
}

fun <T> Sequence<T>.filter(predicate : (T) -> Boolean) : Sequence<T> {
    return sequence {
        for (item in this@filter) {
            val count = 0
            if (predicate(item)) {
                yield(item)
            }
        }
    }
}

fun <T> Sequence<T>.first(): T {
        val it = this@first.iterator()
        if (!it.hasNext()) throw Exception("No more elements!")
        return it.next()
}

fun main() {
    val seq = sequenceOf(3, 5, 1, 3).repeat(3).filter { it == 1 }.first()
    // 3 3 3 5 5 5 1
}