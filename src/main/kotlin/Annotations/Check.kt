package Annotations

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class Check(val valid: String)

fun checkAndSet(target: Any, values: Map<String, Any>) {

}