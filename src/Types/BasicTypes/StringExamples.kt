package Types.BasicTypes


fun main(){
    val stringExamples = StringExamples()
    stringExamples.stringBasics()
    stringExamples.stringsConcatenating()
    stringExamples.stringsAreImmutable()
    stringExamples.stringLiterals()
    stringExamples.stringTemplates()
    stringExamples.stringFormating()

}
class StringExamples {

    fun stringBasics(){
        //Generally, a string value is a sequence of characters in double quotes
        val name = "syed faizal"

        for (char in name) // its return every character one by one
            println(char)

        for (char in name.indices) // its return every character's index one by one
            println(char)
    }

    fun stringsAreImmutable(){
        // don't have a great example to explain it.
    }

    fun stringsConcatenating(){
        var name = "syed"
        println(name+1) // just concatenating
        name = name+" faizal" // by concatenating change variables value
        println(name)
    }

    fun stringLiterals(){
        val firstName= "syed"
        val secondName= "faizal"
        /*
        * Kotlin has two types of string literals:
        * 1. Escaped String
        * 2. multiline String
        */

        // 1. Escaped String
        // Escaped Characters
        /*
        * \t – tab
        * \b – backspace
        * \n – new line (LF)
        * \r – carriage return (CR)
        * \' – single quotation mark
        * \" – double quotation mark
        * \\ – backslash
        * \$ – dollar sign
        */

        println("$firstName\t$secondName") // \t using for tab space
        println("$firstName\b") // \b using remove last character
        println("$secondName\n\tis good boy") // \n using for newLine
        println("$firstName\r$secondName") // \r its return last value
        println("$firstName\r$secondName\r$firstName")
        println("$firstName\'s age is 24") // \' using for single quotation mark
        println("$firstName\" ") // \" using for double quotation mark
        println("$firstName\' Maths mark is 81\\100")
        println("$firstName have \$50")

        // 2.Multiline String

        val text = """
            Welcome to 
            kotlin learning    
        """.trimIndent()
        println(text)
        val text2 ="""
            Welcome to 
            kotlin learning    
        """.trim()  // remove space front and back
        println(text2)
        val text3 = """
            Welcome to 
            kotlin learning    
        """.trimStart() // remove space front only
        println(text3)
        val text4 = """
            Welcome to 
            kotlin learning    
        """.trimEnd() // remove space back only
        println(text4)
        val text5 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()       // clearly don't know about it
        println(text5)
        val text6 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me > and I learn.
    |(Benjamin Franklin)
    """.trimMargin("I")
    }

    fun stringTemplates(){
        // String templates
        /*
        * You can use template expressions to access data stored in variables and other objects,
        *  and convert them into strings.
        * */
        val name = "faizal"
        val old = 24
        println("Hello, I'm ${name}, and i'm ${old + 1} old ")
        println("$name.length is ${name.length}")
    }

    fun stringFormating(){
        //don't have a great example.
    }
}