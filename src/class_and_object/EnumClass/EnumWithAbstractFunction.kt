package class_and_object.EnumClass

fun main(){
    EnumWithAbstractFunction.ENUM_1.abstractFunction()
    EnumWithAbstractFunction.ENUM_2.abstractFunction()
}

/**
 * When the enum class has abstract function, here their constants must be overridden it.
 */
enum class EnumWithAbstractFunction{
    ENUM_1{
        override fun abstractFunction() {
            println("$name abstractFunction")
        }
    },
    ENUM_2{
        override fun abstractFunction() {
            println("$name abstractFunction")
        }
    };

    abstract fun abstractFunction()
}