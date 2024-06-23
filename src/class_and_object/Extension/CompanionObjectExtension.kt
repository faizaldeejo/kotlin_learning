package class_and_object.Extension

/**
 * in kotlin, we can declare extension function and properties to companion object.
 * by using 'Companion" keyword.
 * companion object's extension property and function have same name and struct as it's real property and function.
 * here the real property will call.
 */
fun CompanionObjectExtension.Companion.showName(firstName: String, secondName: String): String{
    return "$firstName $secondName"
}

val CompanionObjectExtension.Companion.name1
    get()= "syed"



val CompanionObjectExtension.name: String
    get()= "faizal"

class CompanionObjectExtension {

    companion object{
        val name= "syed faizal"

        fun printName(){
            println(name)
        }
    }
}


fun main(){
    println(CompanionObjectExtension().name)
    println(CompanionObjectExtension.name)
    CompanionObjectExtension.printName()

    println(CompanionObjectExtension.showName("syed","faizal"))
    println(CompanionObjectExtension.name1)

}