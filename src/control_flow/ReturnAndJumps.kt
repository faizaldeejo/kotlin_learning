package control_flow

fun main(){
    val returnAndJumps= ReturnAndJumps()
    returnAndJumps.breakAndContinue()
    val m= returnAndJumps.labels()
    val t= null
    val s= t ?: return // "?:" check t is null . if it's null return will execute.
    // println(s) // here, variable s have no value. so can't print it.
}

class ReturnAndJumps {
    init {
        /*
        * return - By default returns from the nearest enclosing function
        * break  - Terminates the nearest enclosing loop.
        * continue - proceeds to the next step of the nearest enclosing loop.
        * */
    }
    fun breakAndContinue(){
        for(i in 1..5){
            if(i == 3)break // The break terminate the loop. when the condition is true.
            else{
                println("faizal")
                continue // The continue proceeds the next iteration of the loop
            }
        }
    }

    fun labels(){
        /*
        * In kotlin, Labels have the form of an identifier followed by the @ sign, such as abc@ or fooBar@.
        * To label an expression, just add a label in front of it.
        * */

        OuterLoop@ while(true){
            for(i in 1..5)
                if(i == 3) break@OuterLoop  // if the condition is true the outer loop terminate.
        }

        fun labels2(){
            listOf(1, 2, 3, 4, 5).forEach {  // actually forEach is a function in kotlin.
                if (it == 3) return // non-local return directly to the caller of labels2()
                print(it)
            }
            println("this point is unreachable")
        }

        fun labels3(){
            listOf(1, 2, 3, 4, 5).forEach localFun@ {  // actually forEach is a function in kotlin.
                if (it == 3) return@localFun // local return
                print(it)
            }
            print(" done with explicit label")

            listOf(1, 2, 3, 4, 5).forEach {  // actually forEach is a function in kotlin.
                if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
                print(it)
            }

            listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
                if (value == 3) return  // local return to the caller of the anonymous function - the forEach loop
                print(value)
            })
        }

        /*
        Note that the use of local returns in the previous three examples is similar to the use of continue in regular loops.
        There is no direct equivalent for break, but it can be simulated by adding another nesting lambda and non-locally returning from it:
        */

        /*
        The ‘run’ function is similar to ‘let’, but it’s called on the object itself,
        rather than as an extension function. It executes a block of code with the object
        as its context and returns the result of the last expression within the block.
        */

        run loop@{  // with labels
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop // non-local return from the lambda passed to run
                print(it)
            }
        }

        val t= run {  // without labels
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@run it// non-local return from the lambda passed to run
                print(it)
            }
        }

        println()
        println(t)

        labels2()
        labels3()
    }


}