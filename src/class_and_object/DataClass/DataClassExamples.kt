/**
 * Data classes in Kotlin are primarily used to hold data.
 * For each data class, the compiler automatically generates additional member functions that allow you to print an instance to readable output,
 * compare instances, copy instances, and more. Data classes are marked with data:
 * The primary constructor must have at least one parameter.
 * All primary constructor parameters must be marked as val or var.
 * Data classes can't be abstract, open, sealed, or inner.
 *
 * compiler will generate additional member functions for data class. this functions only takes primary constructor values. those are:
 * .equals() - used to check instance of the data class
 * .hashCode() -
 * .toString() - print the instance of the data class like this. " DataClassExample(val name= syed faizal, age: 24) "
 * .copy() -
 * .componentN()
 */

data class DataClassExamples (var name: String, val age: Int){

}
class ClassExamples(val name: String, val age: Int)


fun main(){
    val dataClassExamples= DataClassExamples("syed faizal", 24)
    val dataClassExamples1= DataClassExamples("syed faizal", 24)
    val classExample= ClassExamples("syed faizal", 24)
    val classExample1= ClassExamples("syed faizal", 24)

    // .equals function to data class
    println(dataClassExamples.equals(dataClassExamples1)) // both instance have same value so return true
    dataClassExamples1.name= "mohamed ashik"
    println(dataClassExamples.equals(dataClassExamples1)) // both instance have different value so return false

    // .equals function to class
    println(classExample.equals(classExample1)) // both instance have same value but return false


    // hashCode function to dataClass
    // both dataclass instance have different value so hashCode is different
    println("dataClassExample hashcode ${dataClassExamples.hashCode()} -- dataClassExample1 hashcode ${dataClassExamples1.hashCode()}")
    // both dataclass instance have same value so hashCode is same
    dataClassExamples1.name= "syed faizal"
    println("dataClassExample hashcode ${dataClassExamples.hashCode()} -- dataClassExample1 hashcode ${dataClassExamples1.hashCode()}")

    // hashCode function to Class
    // both class instance are same but hashCode value is different
    println("classExample hashcode ${classExample.hashCode()} -- classExample1 hashcode ${classExample1.hashCode()}")

    // toString() to dataClass and normal class
    println(dataClassExamples.toString())
    println(classExample.toString())

}

