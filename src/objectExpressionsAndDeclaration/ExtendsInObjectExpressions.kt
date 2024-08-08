package objectExpressionsAndDeclaration


/**
 * when the function return object expressions, that expressions extends two or more class or interface, here we have to give the explicit return type to function.
 */
fun main(){
    fun objExp(): ObjectExpressionsClass =
        object : ObjectExpressionsClass(), ObjectExpressionsInstance, ObjectExpressionsInstance1 {
            init {
                println("init block in Object Expressions")
            }
            override fun abstractFunction() {
                println("it's a abstract functions")
            }
        }
    if(objExp() is ObjectExpressionsInstance  && objExp() is ObjectExpressionsClass && objExp() is ObjectExpressionsInstance1) println(true)
    objExp()
}

open class ObjectExpressionsClass

interface ObjectExpressionsInstance{
    fun abstractFunction()
}
interface ObjectExpressionsInstance1

                                        // Example  2
interface A {
    fun funFromA() {}
}
interface B

class C {
    // The return type is Any; x is not accessible
    fun getObject() = object {
        val x: String = "x"
    }

    // The return type is A; x is not accessible
    fun getObjectA() = object: A {
        override fun funFromA() {}
        val x: String = "x"
    }

    // The return type is B; funFromA() and x are not accessible
    fun getObjectB(): B = object: A, B { // explicit return type is required
        override fun funFromA() {}
        val x: String = "x"
    }
}