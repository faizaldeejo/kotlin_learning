package class_and_object.Generics

/**
 * Generic Constrains are used to restrict the Generic type.
 */

fun main() {
    val human= Human()
    check(listOf(human,human,human))
    val animal= Animal()
    //check(listOf(animal,animal,animal)) // we can't pass it into function, bacz Animal doesn't inherit the Rice class.


    check1(listOf(human, human, human,),listOf(human,human,human))
    //check1(listOf(human,human,human,),listOf(animal,animal,animal)) // we can't pass it into function, bacz Animal doesn't inherit the Rice Class.
}

fun <T: Rice> check(humanList: List<T>){}

interface Rice

interface Water

class Human: Rice, Water

class Animal : Water

/**
 * When our generic type should implement more than one subtype. this case need to write a code like this.
 * it's called 'Multiple upper Bounds'
 */

fun <T,W> check1(list: List<T>, list1: List<W>) where T: Rice, W: Water, W: Rice{

}