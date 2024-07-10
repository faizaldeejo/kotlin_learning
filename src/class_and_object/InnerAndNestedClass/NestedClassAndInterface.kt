package class_and_object.InnerAndNestedClass


/**
 * A class can have nested interface or nested class, as well as A interface can have nested interface or nested class
 */
fun main(){
    OuterClass().outerClassFunction()
    val nestedInstance= OuterClass.NestedClass()
    nestedInstance.nestedClassFunction()
    nestedInstance.nestedInterfaceFunction1()
    nestedInstance.nestedInterfaceFunction()

    val outerInterface= OuterInterface.InterfaceNestedClass()
    outerInterface.outerAbstractFunction()
    outerInterface.interfaceNestedClassFunction()
}

class OuterClass {
    fun outerClassFunction(){
        println("Outer-Class-Function")
    }

    class NestedClass: NestedInterface1{
        fun nestedClassFunction(){
            println("Nested-class-Function")
        }

        override fun nestedInterfaceFunction() {
            println("nested-interface-abstract-function")
        }
    }

    interface NestedInterface1{
        fun nestedInterfaceFunction1(){
            println("Nested-Interface-non-abstract-Function")
        }

        fun nestedInterfaceFunction()
    }
}



interface OuterInterface{
    class InterfaceNestedClass: NestedInterface2, OuterInterface{
        fun interfaceNestedClassFunction(){
            println("Interface-nested-class-function")
        }

        override fun nestedAbstractFunction() {
            println("nestedAbstractFunction")
        }

        override fun outerAbstractFunction() {
            println("outerAbstractFunction")
        }
    }

    interface NestedInterface2{
        fun nestedAbstractFunction()

        fun nestedNonAbstractFunction(){
            println("nestedNonAbstractFunction")
        }
    }

    fun outerAbstractFunction()

    fun outerNonAbstractFunction(){
        println("outerNonAbstractFunction")
    }

}