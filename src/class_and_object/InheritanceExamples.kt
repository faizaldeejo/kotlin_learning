package class_and_object

fun main(){
    InheritanceExamples("faizal")
}

/**
 * All classes in Kotlin have a common superclass, -- Any () -- which is the default superclass for a class with no supertypes declared
 * Any has three methods: equals(), hashCode(), and toString(). Thus, these methods are defined for all Kotlin classes.
 */

class Example // Implicitly inherits from Any

class InheritanceExamples(name: String) : Any() {
    init {
        println(name.equals(name))
        println(name.hashCode())
        println(name.toString())
    }
}

/**
 * By default, Kotlin classes are final we can't be inherited. To make a class inheritable, mark it with the open keyword:
 *
 * actually, SampleClass didn't any arguments it's primary constructor, But its secondary constructor have arguments.
 * so when we want to inherit the SampleClass , while we have to give the value to its secondary constructor.
 *
 * in kotlin, a class can only inherit one class
 */

class Inheritance : SampleClass1("syed","faizal")//, SampleClass2()  // its called derived class
{
    init {
        /**
         * here, actually we inherit SampleClass1 by giving value to its secondary constructor, but we can't use its function.
         * only we can use class property only.
         */
        //super.printName1()
        super.printName()
    }

}

/**
 * If the derived class has no primary constructor,
 * then each secondary constructor has to initialize the base type using the super keyword or it has to delegate to another constructor which does.
 * Note that in this case different secondary constructors can call different constructors of the base type:
 */

class Inheritance1 : SampleClass1{

    constructor(name: String): super(name)

    constructor(firstName: String, secondName: String): super(firstName,secondName)
}

open class SampleClass1{        // it's called Base class

    constructor(name: String){
        fun printName1(){
            println(name)
        }
    }
    constructor(firstName: String, secondName: String){
        fun printName2(){
            println(firstName+secondName)
        }
    }

    fun printName(){
        println("faizal")
    }

}

open class SampleClass2{
    fun printName(){
        println("faizal")
    }
}
                                                        /* Overriding methods */

open class SampleClass4{
    open fun printName(){}

    fun printAge(){}
}

/**
 * when we want to create a function in derived class as same as its base class function.
 * the derived class function must be with override keyword, and the base class function must be with open keyword
 */

open class SampleClass3: SampleClass4(){

    final override fun printName(){}

    fun printAge(age: Int){}

}

/**
 * A function marked override is itself open, so it may be overridden in subclasses.
 * if you want to stop re-overriding use final
 */

class SampleClass5: SampleClass3(){
//    override fun printName(){
//        super.printName()
//    }
}

                                                /* override properties*/

/**
 * in kotlin we can override variables also like methods.
 * but the datatype must be same. val or var is our wise.
 */

open class InheritanceClass6{
    open val name= "faizal"
}

class InheritanceClass7: InheritanceClass6() {
    override var name = "faizaldeejo"
}

class InheritanceC8(override var name: String = "faizal"): InheritanceClass6()