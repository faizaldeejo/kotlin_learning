package objectExpressionsAndDeclaration


/**
 * we can declare companion object inside the class with or without name.
 * inside the class we can declare only one companion object.
 * and we can declare object inside the class.
 */

/*
Semantic difference between object expressions and declarations
There is one important semantic difference between object expressions and object declarations:

Object expressions are executed (and initialized) immediately, where they are used.

Object declarations are initialized lazily, when accessed for the first time.

A companion object is initialized when the corresponding class is loaded (resolved) that matches the semantics of a Java static initializer.

 */
fun main(){
    println(CompanionObject.coName)
    println(CompanionObject.Object.oName)
    println(CompanionObject().className)
}

class CompanionObject{
    var className: String = "ClassName"

    val obj = object {
        val name: String = "faizal"
    }

    companion object{
        var coName: String = "Companion Object Name"
    }

    object Object{
        var oName: String = "Object Name"
    }
}