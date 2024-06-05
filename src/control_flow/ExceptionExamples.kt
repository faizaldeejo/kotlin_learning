package control_flow

fun main(){
    val exceptionExamples= ExceptionExamples()
    //throw Exception("Hi There!") // use to throw exception
    exceptionExamples.exceptionExamples()
    println(exceptionExamples.nothingType())

}



class ExceptionExamples {
    /*
    To catch an exception, use the try...catch expression:
    try {
    // some code
    } catch (e: SomeException) {
    // handler
    } finally {
    // optional finally block
    }

    There may be zero or more catch blocks, and the finally block may be omitted.
    However, at least one catch or finally block is required.
     */
    fun exceptionExamples(){
        // try is an expression, which means it can have a return value:
        val input= "faizal"

        val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
        println(a)
        val qa = try { "faizal" } catch (e: NumberFormatException) { null }

        /*The returned value of a try expression is either the last expression in the try block or
          the last expression in the catch block (or blocks). The contents of the finally block don't affect
          the result of the expression.*/
        val b = try{
            if(true){
                1
            }else{
                2
            }

            when(true){
                true -> 3
                else -> 4
            }
        }finally {
            5
        }
        println(b)
    }

    fun nothingType(){
        //val s = throw IllegalArgumentException("Name required")
        val s =  fail("Name required")
        //println(s)     // 's' is known to be initialized at this point
    }

    fun fail(message: String): Nothing{
        throw IllegalArgumentException(message)
    }

}