package Types

fun main(){
    val typeCheckAndCasting= TypeCheckAndCasting()
    typeCheckAndCasting.typeCheck(typeCheckAndCasting)
    typeCheckAndCasting.smartCaste("faizal")
    typeCheckAndCasting.safeAndUnsafeOperators()
}

class TypeCheckAndCasting {

    fun typeCheck(variable: Any){
        when(variable){ // is operator is used to check the value's datatype in given type
            is String -> println("It's a String datatype")
            is Long -> println("It's a Long datatype")
            is Int -> println("It's a Int datatype")
            is Float -> println("It's a Float datatype")
            is Byte -> println("It's a Byte DataType")
            is Double -> println("It's a Double DataType")
            is Short -> println("It's a Short DataType")
            is Char -> println("It's a Char DataType")
            else -> {println("It's Not a primitive data type")}
        }

        if(variable !is String) // !is operator perform the opposite term of is operator
            println("variable is not a string type")
    }

    fun smartCaste(x: Any) {
        if (x is String) // it the condition is true the compiler automatically convert the variable into the given type
            println(x.length)

        //println(x.length)
    }

    fun safeAndUnsafeOperators(){
        val stringValue = "faizal"
        val stringValue1= stringValue as String   // No Exception   Ans: faizal

        val value: String? = null
        val value1= value as String    // throws Exception

        val value2: String? = null
        val value3= value2 as? String   // No Exception    Ans: null

        val intValue= 4
        val stringValues2= intValue as String // throws Exception
        val StringValues3= intValue as? String   // No Exception  Ans: null
    }


}