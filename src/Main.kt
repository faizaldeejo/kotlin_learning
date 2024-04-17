import samplePackage.BasicMaths as MathFun


fun main() {

    //Variables
    /*
    * In kotlin variables are two types
    * val - read-only vaiables
    * var - mutable variables */
    val v1 = 50 // we can't reassign it.
    var v2 = 30
    println(v2)
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    // String templates
    /*
    * You can use template expressions to access data stored in variables and other objects,
    *  and convert them into strings.
    * */
    val name = "faizal"
    val old = 24
    println("Hello, I'm ${name}, and i'm ${old + 1} old ")

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    //Package and Importing
    /*
    * When we want to access a class or it's properties from another package. While we must import.
    * In case, We want to access a class or it's properties in same package. While we don't need to import it.
    */
    val basicMaths = MathFun()
    println(basicMaths.addition(1,2))

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    // Conditional expressions

    /*fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }*/

    // In Kotlin, we can write an expression like this.

    fun maxOf(a: Int, b: Int) = if(a > b) a else b
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    // For Loop
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) { // iterate each value one by one
        println(item)
    }


    for (index in items.indices) { // iterate each value's index one by one
        println("item at $index is ${items[index]}")
    }

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    // While Loop ( We can't use while loop like for loop in kotlin )

    val fruits = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < fruits.size) {
        println("item at $index is ${items[index]}")
        index++
    }

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/


}