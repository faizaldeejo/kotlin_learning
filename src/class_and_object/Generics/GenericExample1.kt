package class_and_object.Generics


/**
 *
 */
fun main() {
    val generic= Generic<String>("")
    val values= generic.getValue()
    println(values)
}

class Generic<T>(val v: T){
    fun getValue(): T? {
        val r = when(v) {  // when expresses always return Any? type
            is Int -> 5
            is String -> "String"
            else -> null
        }

        if(r is Any?)  // true
            println(true)

        return r as T // r datatype is Any?, but it contains string value, so as operator change r type from String to T Type, T is also String. so it run safely.
    }
}