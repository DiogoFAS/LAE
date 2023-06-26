package T1

fun <T : Any> Sequence<T?>.noNullsLazy(): Sequence<T> {
    return sequence {
        val it = this@noNullsLazy.iterator()
        while (it.hasNext()) {
            val curr = it.next()
            if (curr != null) {
                yield(curr)
            }
        }
    }
}

fun <T : Any> Sequence<T?>.noNullsEager(): Sequence<T> {
    return sequence {
        val resList = mutableListOf<T>()
        for (item in this@noNullsEager) {
            if(item != null) {
                println(item)
                resList.add(item)
            }
        }
        yieldAll(resList)
    }
}

fun main() {
    val seq = sequenceOf(null, 3, null, 1, null).noNullsEager()
    seq.iterator().next()
}