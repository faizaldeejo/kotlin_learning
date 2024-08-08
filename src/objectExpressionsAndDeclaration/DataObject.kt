package objectExpressionsAndDeclaration

/**
 * when we print the plain object, it's toString() represent it's name and hash.
 * But data object's toString() represent it's Name only, And equals() and  hashCode() toString functions will create. like data class.
 * we can't override hashCode(), toString(), equals() functions inside the data object, bcaz, implicitly those functions are inside the data object.
 * and data object have no copy(), componentN() init.
 */

fun main(){
    val obj1 = Object
    val obj2 = Object
    val dataObj1 = DataObject
    val dataObj2 = DataObject
    println(obj1)
    println(obj1.hashCode())
    println(obj2.hashCode())
    println(obj1.equals(obj2))
    println(dataObj1)
    println(dataObj1.hashCode())
    println(dataObj2.hashCode())
    println(dataObj1.equals(dataObj2))
    println(dataObj1 is Any)
}

object Object{
    override fun hashCode(): Int = 6
}

data object DataObject{
    // we can't override hashCode(), toString(), equals() functions inside the data object, bcaz, implicitly those functions are inside the data object.
    //override fun hashCode(): Int = 6
}