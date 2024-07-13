package class_and_object.EnumClass

/**
 * An enum is a special "class" that represents a group of constants (unchangeable variables)
 * Enum entries should be uppercase. Each enum constance have two values name and ordinal
 * In enum class, The class body must start with Enum Constants, the last enum constant must be ended with ';'.
 * An enum class can have secondary constructor.
 * val enum1= EnumClassExample.ENUM_1.name // ENUM_1 // name returns the constant's value,
 * val enum1_ordinal= EnumClassExample.ENUM_1.ordinal // ENUM_1 // ordinal returns the constant's Index,
 * we can't create an instance of enum class. but each enum constants is an instance of the enum class.
 * we can't access another enum constant by one enum constant, But each Enum constants is an instance of the enum class.
 * by using enum constant we can access the class properties
 * enum class can have init block. while taking the constance of the enum class the init block will execute number of times how many enum constance.
 * when the primary constructor have arguments without default value, the argument value must be defined in constant value.
 */

fun main(){
    val enum1 = EnumClassExamples.ENUM_1
    println(enum1 is EnumClassExamples)
    println("name of ENUM_1 ${enum1.name}")
    println("ordinal of ENUM_1 ${enum1.ordinal}")
    println("class property fullName ${enum1.fullName}")
    enum1.showFullName()

    println(enum1.pair)
    println(EnumClassExamples.ENUM_2.pair)

}

enum class EnumClassExamples(val pair: Pair<String,Int>,relation: String, gender: String= "Male"){
    ENUM_1(Pair("syed faizal",24),"Me"),
    ENUM_2(Pair("syed basha", 26),"Borther"),
    ENUM_3(Pair("syed ameer", 58), "Father");

    val fullName: String= "syed faizal"
    init {  // init block will execute 3 times, becz there are 3 constants.
        println("init block")
    }

    fun showFullName(){
        println("showFullName- function")
    }
}