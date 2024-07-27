package class_and_object.Generics

fun main(){
    /**
     * Any is a superclass of all class and also Int class inherit the Any class, so as per the rule 'subclass is also super class'
     * so i is also j,
     *
     * But it doesn't work in Array, bcaz, in kotlin Array contains generic concept, 'Array<T>'
     * so in kotlin generics what type of variable we declare, we have to give that type only. so here, we cant assign listOfInt into listOfAny.
     */
    val i: Int = 5
    val j: Any = i

    val intList  = arrayOf(2,3,4,5,6,)
    //val anyList : Array<Any> = intList // we can't assign

    // We can do it in another way
    allowSubClassToAccessSuperClass()
    allowSubClassToAccessSuperClass()
    starType()
}

/**
 * actually, Array support generic, so we can't assign listOfInt into listOfAny.
 * But using 'out' key we can allow to access the superType by subType.
 * so here, we can assign the listOfInt into listOfAny.
 */

fun allowSubClassToAccessSuperClass(){
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any: Array<Any?> = arrayOfNulls(3)

                // with 'out' keyword //

    fun copy1(from: Array<out Any>, to: Array<Any?>) {
        assert(from.size == to.size)
        for (i in from.indices)
            to[i] = from[i]
    }

    copy1(ints, any)

            // without 'out' keyword
//    fun copy2(from: Array<Any>, to: Array<Any?>) {
//        assert(from.size == to.size)
//        for (i in from.indices)
//            to[i] = from[i]
//    }

    //copy2(ints, any)
}

/**
 * actually, Array support generic, so we can't assign listOfAny into listOfInt.
 * But using 'in' key we can allow to access the subType by superType.
 * so here, we can assign the listOfAny into listOfInt.
 */

fun allowSuperClassToAccessSubClass(){
    val anyList: Array<Any?> = arrayOfNulls(1)
    // with 'in' keyword
    fun addItem1(anyList: Array<in Int>, value: Int) {
        anyList[0] = value
    }

    addItem1(anyList, 1)

    if(anyList[0] == 1) println(true) else println(false)
    // without 'in' keyword

//    fun addItem2(anyList: Array<Int>, value: Int) {
//        anyList[0] = value
//    }
//
//    addItem2(anyList, 1)
//
//    if(anyList[0] == 1) println(true) else println(false)

}

                    // star type projection
/**
 * By using kotlin star '*' type we can assign any type into it.
 */

fun starType(){
    val intArray= arrayOf(1,3,4,5,5,)
    val anyArray= arrayOf("faizal",3,4,'d')

    fun printArray(array: Array<*>) {
        array.forEach { println(it) }
    }

    printArray(intArray)
    printArray(anyArray)
}

