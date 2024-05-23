package control_flow

import hasPrefix
import samplePackage.Bit

fun main(){
     val conditionsAndLoops= ConditionsAndLoops()
     conditionsAndLoops.ifExpressions()
     conditionsAndLoops.whenExpressions()
     conditionsAndLoops.forLoop()
     conditionsAndLoops.whileLoop()
}

class ConditionsAndLoops {
     fun ifExpressions(){
         // ternary Operator-
         // In java ternary operator work like below content
         /*
         * x = 20;
         * y = (x == 1) ? 61: 90; // if the condition is true 61 is return if not 90 will return . In java
         *
         * if is an expression: it returns a value.
         * Therefore, there is no ternary operator (condition ? then : else) because ordinary if works fine in this role.
         * */

          val a = if (4 > 3) 4 else 3

          // You can also use `else if` in expressions:
          val b= if(1 == 2) 3 else if (3 == 4 ) 5 else 6

          val max = if (a > b) {
               print("Choose a")
               a
               } else {
               print("Choose b")
               b
               }
     }

     fun whenExpressions(){
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
     }

     fun forLoop(){
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
     }

     fun whileLoop(){
          // While Loop and do while ( We can't use while loop like for loop in kotlin )
          val items = listOf("apple", "banana", "kiwifruit", 9)

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
     }

}