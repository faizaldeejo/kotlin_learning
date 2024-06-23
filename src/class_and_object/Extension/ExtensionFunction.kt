package class_and_object.Extension

/**
 * The Kotlin extension allows to write new functions for a class from a third-party library without modifying the class.
 * The beauty of the extension functions is that they can be called in the usual way,
 * as if they were methods of the original class and these new functions are called Extension Functions.
 */

/**
 * to declare the extension function, before it's name receiver type is must.
 * inside the extension function this keyword corresponds the receiver type.
 *
 */

fun Int.minusOne(): Int{
    return this-1
}

fun String?.checkNull(): Boolean{   // in extension function receiver type may null
    return this == null
}

fun ArrayList<Int>.swapOnlyInt(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

/**
 * if your extension function suite to yours all ArrayList, while it's muster include generic.
 * 'T' corresponds generic.
 */

fun <T> ArrayList<T>.swapToAll(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

/**
 * When the class have member function and extension function with same name and struct. here member function will call.
 */

fun ExtClass.show(){
    println("extension-function-show")
}
fun ExtClass.hide(status: Boolean){
    println("extension-function-hide")
}

class ExtClass{
    fun show(){
        println("member-function-show")
    }
    fun hide(){
        println("member-function-hide")
    }
}

fun main(){
    println(5.minusOne())
    val nameList= arrayListOf("faizal", "ashik", "syed", "hari")
    val numList= arrayListOf(23,45,66,4,33,9)

    println(numList.swapOnlyInt(0,3)) // the type is ArrayList<Int>
    //println(nameList.swapOnlyInt(0,3)) // the type is ArrayList<String>, so receiver type is mismatch
    println(nameList.swapToAll(0,3)) // receiver type is generic, so we can use extension function.

    val name: String?= null
    println(name.checkNull())

    ExtClass().show() // it will call member-function
    ExtClass().hide() // it will call member-function
    ExtClass().hide(true) // it will call extension function
}