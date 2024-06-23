package class_and_object

fun main(){
    PropertyClass()
}

/**
 * in kotlin we can declare mutable and immutable properties,
 * var is mutable, val is immutable
 */
class PropertyClass {
    val name: String= "faizal"
    var age: Int= 24

    /**
     *  Getter and Setters syntax
     *  var <propertyName>[: <PropertyType>] [= <property_initializer>]
     *     [<getter>]
     *     [<setter>]
     *
     * getter and setter is optional,
     * by default in kotlin each property have getter and setter.
     * but, val only have getter, var have both
     * You can define custom accessors for a property. if you define getter, it will call every time when you access it.
     */

    val fullName= "Syed faizal" // if the property has value there no need to declare it's datatype.

    val name1: String
        get()= "faizal"
    val age1 // you can omit type
        get()= 3

    val value: String = "name"   // when you access the property, actually it's getter method will execute.
        get(){
            println(field)
            return field
        }
    var value2 = "faizal"  // when you set value to the property, actually it's setter method will execute.
        set(value){  // the setter parameter's argument name is our wish
            println(value)
            field= value
        }

    init{
        value2 = "syed"
        value2 = "ashik"
    }

}