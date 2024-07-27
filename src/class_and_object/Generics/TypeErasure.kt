package class_and_object.Generics


/**
 * In kotlin, Generic types become Any? in runtime. it's called 'type erasure'
 * In below example, we are type cast the String into Int. actually, isn't possible but in generics it's possible.
 * bacz, at runtime generic type become Any?. so we can type case the String into Any?.
 */
fun main(){
    println(printAny<Int?>("faizal")) // it's print the value without issues. but the below statement occurs runtime error.

    /**
     * the below statement occurs runtime error, bcaz, at compile time the 'intValue' gets Generic type, here we give Int,
     * but runtime 'T' becomes Any?, the parameter value String cast into Any?. its done without any issues.
     * but set the return value into the 'intValue' its occurs 'ClassCastException' at runtime. bacz, return value is Any?, we can't assign into Int variable.
     */
    val intValue = printAny<Int>("faizal") // it's occurs runtime error,
}

fun <T> printAny(any: String): T = any as T // T becomes Any? in runtime so it's working, then it's called type erasure
