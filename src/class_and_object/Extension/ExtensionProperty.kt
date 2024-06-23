package class_and_object.Extension


/**
 * a class have member property and extension property with same name, member property will call.
 * we can't declare value directly to extension properties. Only by getter
 *
 */

var ExtensionProperty.name: String
    get()= "syed faizal"
    set(value) {
        this.name = value
    }

var ExtensionProperty.firstName: String
    get()= "syed"
    set(value){
        this.firstName= value
    }

val ExtensionProperty.secondName: String
    get()= "faizal"

val <T> List<T>.lastIndex: Int  // lastIndex is the List class's extension propery
    get() = size - 1

class ExtensionProperty {
    var name: String= "faizal"
}

fun main(){
    println(ExtensionProperty().name)
    println(ExtensionProperty().firstName)
    println(ExtensionProperty().secondName)
    val list= listOf("faizal","syed")
    println(list.lastIndex)
}