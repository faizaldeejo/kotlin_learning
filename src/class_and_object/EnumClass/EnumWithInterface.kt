package class_and_object.EnumClass

/**
 * Enum class can inherit one or more interface, but can't inherit classes.
 * Interface's abstract function must be commonly override inside the enum class body, or each enum constants must be override it.
 * we can commonly override the interface's abstract function and also override the abstract function in any enum constants.
 * Enum class can have companion object.
 * Enum class can't extends superClass. but extends one or more interface.
 */

fun main(){
    EnumWithInterface.ENUM_1.enumInterfaceAbstractFunction() // it calls ENUM_1's override function
    EnumWithInterface.ENUM_2.enumInterfaceAbstractFunction() // it calls common override function
    EnumWithInterface.ENUM_1.classFunction()
    println(EnumWithInterface.ENUM_1 is EnumWithInterface) // Enum constants also the instance of the Enum class.
    println(EnumWithInterface.myName)

}


open class EnumSuperClass{

}

interface EnumInterface{
    fun enumInterfaceAbstractFunction()

    fun enumInterfaceNonAbstractFunction(){
        println("enumInterfaceNonAbstractFunction")
    }
}



enum class EnumWithInterface: EnumInterface//,EnumSuperClass()
{
    ENUM_1(){
        init {
            println("init block of $name")
        }

        override fun enumInterfaceAbstractFunction() {
            println("enumInterfaceAbstractFunction - $name")
        }

    },
    ENUM_2() {
        init {
            println("init block of $name")
        }
    };

    override fun enumInterfaceAbstractFunction() {
        println("common enumInterfaceAbstractFunction - $name")
    }

    fun classFunction(){
        println("classFunction")
    }

    companion object{
        val myName: String= "faizal"
    }
}