package Types

import samplePackage.Bit
import kotlin.reflect.typeOf

fun main(){
    val basicTypes = BasicTypes()
    basicTypes.numbers()

    println(System.identityHashCode(basicTypes))
}

class BasicTypes {
    val t = "faizal"

    fun numbers(){
        /*
        * Kotlin provides a set of built-in types that represent numbers.
        * For integer numbers, there are four types with different sizes and, hence, value ranges:
        */
/*
Type         Size(bits)         MinValue                    MaxValue

Byte         8                  -128                        127
Short        16                 -32768                      32767
Int          32                 -2,147,483,648(-2^31)       2,147,483,647(2^31-1)
Long         64                 -9,223,372,036,             9,223,372,036,854,
                                   854,775,808 (-2^63)                775,807 (263 - 1)

 */
        val c = '\r'
        val str = "faizal"
        var rts = "faizal"
        println(str.hashCode())
        rts = "syed"
        println(rts.hashCode())
        println(t.hashCode())
        val i = 5
        var m = 5
        println(i.hashCode())
        m++
        println(m.hashCode())


        //println(c)

    }
}