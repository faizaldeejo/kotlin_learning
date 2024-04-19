import samplePackage.Bit
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

    val items = listOf("apple", "banana", "kiwifruit", 9)

    for (item in items) print(item)

    for (item in items) { // iterate each value one by one
        println(item)
    }

    val ints = arrayOf(2,2,2)

    for (item: Int in ints) {
        println(item)
    }

    for (i in 6 downTo -2 step 2) {
        println(i)
    }

    for (index in items.indices) { // iterate each value's index one by one
        println("item at $index is ${items[index]}")
    }

    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    // While Loop and do while ( We can't use while loop like for loop in kotlin )

    val fruits = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < fruits.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    do {
        val y = null
        println(y)
    }
    while (y != null) // y is visible here!

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    // When Expression
    /*
    * When is like if black .But when must be accepted one branch. like step 1 example
    * */

    //Step - 1
    val x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    //Step - 2
    /* suppose our when is depends on enum class entries and sealed class subtypes,
    * while we must be use all branches of enum and sealed class. if one branch is missed, we have to use else.
    * */

    val bitValue1 = when (Bit.ZERO) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
        // 'else' is not required because all cases are covered
    }

    val bitValue2 = when (Bit.ONE) {
        Bit.ZERO -> 0
        else -> 1 // else is required.
    }

    val value3 = when (x){
        0, 1 -> println("x == 0 or x == 1")  // can use comma for multiple cases
        else -> println("otherwise")
    }

    val s = "1"

    when (x) {
        s.toInt() -> println("s encodes x")
        else -> println("s does not encode x")
    }

    val validNumbers = arrayOf(1,2,3,4,5)
    when (x) {
        in 1..10 -> println("x is in the range")   // in - is used to check range
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    when {
        1 in validNumbers -> println("1 is available in validNumbers")
        2 in validNumbers -> println("2 is available in validNumbers")
    }

    println(hasPrefix(s))

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    // Ranges

    val v4 = 10
    val v5 = 9
    if (v4 in 1..v5) {  // in - is used to checked the left side value is under in right side value range
        println("fits in range")
    }
    else {
        println("not fits in range")
    }

    val list = listOf(1,2,3,4,5,6)
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")  // startsWith() function used to check the given string starts with the given parameter
    is Int -> x  // is - is used to check the given values data type
    else -> false
}




