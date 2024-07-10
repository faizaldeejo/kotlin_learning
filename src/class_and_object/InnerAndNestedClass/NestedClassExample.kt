package class_and_object.InnerAndNestedClass

/**
 * A class have a another class inside it. it's know as nested class.
 * by creating outer class instance, we can't access the nested class properties and functions.
 *
 */

fun main(){
    NestedClassExample()                //creating instance of outerClass
    NestedClassExample.NestedClass() //creating instance of nestedClass
}

class NestedClassExample{
    fun classFunction(){
        println("Class-Function")
    }

    class NestedClass{
        fun nestedClassFunction(){
            println("Nested-Class-Function")
        }
    }
}