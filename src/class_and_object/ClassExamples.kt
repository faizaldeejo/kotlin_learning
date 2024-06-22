package class_and_object

fun main(){
    /**
     * Classes in Kotlin are declared using the keyword class:
     *
     * class Person { /*...*/ }
     * The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor, and some other things),
     * and the class body surrounded by curly braces. Both the header and the body are optional; if the class has no body, the curly braces can be omitted.
     */

    /**
     * To create the object of a class call the constructor as regular functions.
     */

    val class4= Class4("faizal")
    // println(class4.name)  // we can't access primary constructor variables by the instance of the class.
    val class5= Class5("faizal")
    println(class5.name)
    println(Class5("faizal").name)

    Class6(1,2,3)
    Class7("Syed Faizal")


}

class ClassExamples
/**
 * A class in Kotlin has a primary constructor and possibly one or more secondary constructors.
 * The primary constructor is declared in the class header, and it goes after the class name and optional type parameters.
 */

class Class1 {  // the class have primary constructor without arguments

}

class Class2(name: String){  // the class have primary constructor with arguments

}

class Class3 constructor(name: String){ // to the primary constructor the constructor keyword is optional.

}
                                                /* primary constructor */
class Class4(name: String){ // here the name variable is primary constructor property not to the class property.
    /**
     * we didn't give any val or var to class's arguments variables, the variables are primary constructor variables.
     * so, we can't access it into the class member functions.
     */

    /**
     * we can access the primary constructor variables inside the class body, not into the class member functions.
     * bcaz, in kotlin primary constructor have no separate body, it takes class body.
     */

    val firstName= name.uppercase()

    fun printName(){
        //println(name) // we can't use name here. bcaz it's primary constructor variables.
    }

}

class Class5(val name: String){  // here the name variable is class property and also primary constructor property.
    /**
     * By giving val or var to class's argument variables, the variables are class variables
     * so, we can access the variable everywhere into the class.
     */

    val firstName= name.uppercase()

    fun printName(){
        println(name)  // we can use it. bcaz name is class property.
    }
}

                                            /* initializer block*/
/**
 * A class may have one or more init blocks , but each init blocks only depends on class and primary constructor
 */

class initClass(val name: String, age: Int){
    init {
        println(name+age)
    }
    constructor(name1: String):this(name1,5)
    init {
        // actually class body execute one by one line. so std variable declared after this init block so we can't use it.
       // println(name1+age)
        //println(std)
    }

    val std = "preKG"


}


                                            /* secondary constructor*/

/**
 * in kotlin we can declare one or more secondary constructor,
 * but each constructor's argument type must be different.
 * then each secondary constructor must be point out it's primary or another secondary constructor. however the end it point out the primary constructor.
 */

class Class6(sum: Int){
    /**
     * In class or primary constructor arguments we can't write any code. If you want to run some code during object creation,
     * use initializer blocks inside the class body. the primary constructor initializes a class instance and its properties in the class header.
     * class body and initializer blocks will execute after each secondary constructor's execution.
     */

    init {
        println(sum)
    }

    constructor(num1: Int, num2: Int):this(num1+num2) // this secondary constructor point out the primary constructor

    constructor(num3: Int, num4: Int, num5: Int):this(num3+num4,num5)  // this secondary constructor point out the another secondary constructor

}

                                        /* During the initialization of an instance*/

/**
 * The initializer blocks are executed in the same order as they appear n the class body.
 * primary constructor parameters can be used in the initializer blocks. also class body not in class member functions.
  */

class Class7(name: String){
    init {
        println("The full name is $name")
    }
    private val firstName= name.split(" ")[0]
    init {
        println("The first name is $firstName")
    }
    private val secondName= name.split(" ")[1]
    init {
        println("The second name is $secondName")
    }

    fun printFun(name: String){
        // println(name)
    }
}
                                                /*trailing comma*/

class Person(
    val firstName: String,
    val lastName: String,
    var age: Int, // trailing comma
) { /*...*/ }


/**
 * Even if the class has no primary constructor, the delegation still happens implicitly, and the initializer blocks are still executed:
 */
class Class8{
    init {
        //println("The name is $name")  // here we can't get name variable, bcaz it's secondary constructor variable.
    }

    constructor(name: String){
        println("The name is $name")
    }
}
