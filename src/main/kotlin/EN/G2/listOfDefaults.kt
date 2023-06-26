package EN.G2

import kotlin.reflect.full.createInstance

inline fun <reified T: Any> listOfDefaults(n : Int = 0) : List<T> {
    val list = mutableListOf<T>()
    for (i in 0..n) {
        val instance: T = T::class.createInstance()
        list.add(instance)
    }
    return list
}
