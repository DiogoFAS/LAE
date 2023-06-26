package T1

inline fun <reified R> List<*>.weaklyCheckedAs() : List<R> {
    if (!isEmpty()) {
        first() as R
    }
    return this as List<R>
}