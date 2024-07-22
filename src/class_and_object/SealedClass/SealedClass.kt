package class_and_object.SealedClass

import class_and_object.SealedClass.SealedClass.SubObject.nonAbstractFunction


/**
 * Sealed classes are used to cover the all possible states of an operations.
 * we can't create an instance to the sealed class. but sealed class have a constructors.
 * By default, sealed classes are Abstract classes and have private modifiers.
 * we can't access sealed class from another file. otherwise access within the same file.
 * declare all the subclass inside the sealed class or declare inside the sealed class file wherever both are same.
 */


fun main(){

}

sealed class SealedClass(){
    class SubClass1 : SealedClass() {
        override fun abstractFun() {
            TODO("Not yet implemented")
        }

    }
    abstract class SubClass2: SealedClass()

    data class SubDataClass(val name: String): SealedClass() {
        override fun abstractFun() {
            TODO("Not yet implemented")
        }
    }

    object SubObject: SealedClass(){
        override fun abstractFun() {
            TODO("Not yet implemented")
        }

    }

    interface SubInterface{

    }

    class d{
        init {
            nonAbstractFunction()
        }
    }

    enum class SubEnum{
        V1,
        V2;
    }

    abstract fun abstractFun()

    fun nonAbstractFunction(){
        println("NON-Abstract-Function")
    }
}