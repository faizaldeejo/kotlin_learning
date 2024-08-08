package objectExpressionsAndDeclaration


/**
 * object Expressions are used to create an 'anonymous class' in kotlin, anonymous class means a class doesn't have name.
 * by default, object extends Any class as all classes in kotlin, so we can override all functions from any class.
 * then, when you assign a object expressions into a variable. the variable type is 'Any'.
 * In case, extends or implement a class or interface. the variable type is extended class or interface type.
 * suppose, extends two are more class or interface, here we have to give any once type to the variable,
 * declare the object expression as global property in class, we can't access it outside scope
 * but we can access its extended class and interface properties or functions from outside scope.
 * object expressions are not singleton. it means object expressions not unique for each objects.
 */

fun main(){
    val objExp= object{
        val name: String = "faizal"
        override fun toString(): String = name
    }
    println(objExp.name)

    val objExp1 = ObjectExpressions()
    println(objExp1.objExp2) // it's called extended Any class's toString() functions.
    //println(objExp1.objExp2.name) // we can't access the properties and functions of the object expressions.
}


class ObjectExpressions{
    val objExp2 = object{
        val name: String = "syed"
        override fun toString(): String = name
        fun get_Name(): String = name
    }
}