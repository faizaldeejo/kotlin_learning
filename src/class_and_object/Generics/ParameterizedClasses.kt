package class_and_object.Generics


/**
 *
 * When you want a property to have differing data types,
 * Kotlin provides something called generic types that allow you to have a single property that can have differing data types,depending on the specific use case.
 *
 * when after the class name it contains angle brackets '<>' those class know as Generic Class. we have to give its type while using.
 */



fun main(){

    val parameterizedClass = ParameterizedClass<String>("string-value")
    val parameterizedClass1 = ParameterizedClass("string-value")

    val res = parameterizedClass.getValue()

    println(res is String)

}

class ParameterizedClass<A>(private val value: A) {
    fun getValue(): A {
        return value
    }
}