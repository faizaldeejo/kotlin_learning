package class_and_object.Generics


fun main(){
    /**
     * by using generic it's return what you give, by default in other concepts subclass is also superclass. But Not in Generic without using In and Out keys
     *
     * out - when your reference type may be it's subClass type, in this case we can use out keyword.
     * in - when your reference type may be its superclass type, in this case we can use in keyword.
     * otherwise its only accept its own type reference.
     */



    var fixedGenericType: FixedGenericType<FastFood> =
        FixedGenericType<FastFood>() //✅ FastFood is needed. so its accept it.
        //FixedGenericType<Food>() //❌ Food is superclass of FastFood, but its not accept in generic concept
        //FixedGenericType<Burger>() //❌ Burger is subclass of FastFood, But it's not accept in generic concept


    var consumerGenericType: ConsumerGenericType<FastFood> =
        ConsumerGenericType<FastFood>() //✅ FastFood is needed. so its accepted.
    ConsumerGenericType<Food>() //✅ Food is superClass of FastFood, here we are using in keyword, so its accepted.
    ConsumerGenericType<Burger>() //❌ Burger is subClass of FastFood, but its not accept in generic concept.


    var producerGenericType: ProducerGenericType<FastFood> =
        ProducerGenericType<FastFood>() //✅
    ProducerGenericType<Food>() //❌
    ProducerGenericType<Burger>() //✅ Burger is subClass of FastFood, here we are using out keyword, so its accepted.

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
