package class_and_object.Generics

/**
 * in kotlin we can declare generic concept in to functions.
 * in generic functions generic type should be in upper case.
 */

fun main(){
    val intList = listOf<Int>(1,2,3,4,4,5,5,4)
    val stringList= listOf<String>("syed","faizal")
    val anyList= listOf("faizal",1,2,3.4,'c')
    val instanceList = listOf(GenericFunctions(), GenericFunctions())

    // when out all Generic Type comes under the functions parameter, we don't need to give type, while call the function.
    printList(intList,stringList)
    printList(anyList,instanceList)

    println(showName<String>()) // here we have to declare the generic Type into the function parameter.

}

data class GenericFunctions(val function: String = "Generic Function")


fun <T,M> printList(valueList1: List<T>, valueList2: List<M>){
    valueList1.forEach {
        println(it)
    }
}

fun <T> showName(): T = "faizal" as T

