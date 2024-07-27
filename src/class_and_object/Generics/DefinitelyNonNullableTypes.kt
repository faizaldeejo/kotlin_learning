package class_and_object.Generics

/**
 * in kotlin, we can restrict the generic type can't be null. by using kotlin's non-nullable type ' T & Any'
 */

fun main(){
    println(nonNullable("string")) // its work without issues. we are give String value
    //println(nonNullable(null)) // its give error, bcaz, we restrict the Generic Type must be non-null .
}

fun <T> nonNullable(value: T & Any): T = value