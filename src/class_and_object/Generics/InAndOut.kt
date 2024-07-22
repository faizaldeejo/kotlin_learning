package class_and_object.Generics


/**
 *
 *
 * 
 */


fun main(){

    var fixedGenericType: FixedGenericType<FastFood> =
        FixedGenericType<FastFood>() //✅
    //FixedGenericType<Food>() //❌
    //FixedGenericType<Burger>() //❌


    var consumerGenericType: ConsumerGenericType<FastFood> =
        ConsumerGenericType<FastFood>() //✅
    ConsumerGenericType<Food>() //✅
    ConsumerGenericType<Burger>() //❌


    var producerGenericType: ProducerGenericType<FastFood> =
        ProducerGenericType<FastFood>() //✅
    ProducerGenericType<Food>() //❌
    ProducerGenericType<Burger>() //✅

}

class Burger: FastFood()
open class FastFood: Food()
open class Food

// Invariants Generic Class
class FixedGenericType<T>

//Contravariant Generic Class
class ConsumerGenericType<in T>

//Covariant Generic Class
class ProducerGenericType<out T>
