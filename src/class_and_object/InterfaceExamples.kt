package class_and_object

fun main(){
    Class().secondName
}
/**
 * in kotlin, interface can contain abstract and non-abstract methods.
 * we can declare properties, but these need to be abstract or provide accessor implementations.
 */

interface Interface1{
    /**
     * in interface, we can't declare value to properties. but we can declare accessor getter to properties.
     * but, interface properties can't create backing fields.
     *
     * a function have nobody in interface it's known as abstract function. otherwise it's a normal function
     */

    val firstName: String               // by default, it's an abstract property
    //val firstName: String = "syed"    // we can't declare value to properties.

    val secondName: String              // we can give value like this, by getter.
        get()= "faizal"


//    var secondName: String
//        get()= "secondName"             // to give value like this, kotlin doesn't create backing field, so getter is accepted.
//        set(value){                     // but setter will create backing field . so setter is not accepted inside of interface.
//            field = value
//        }

//    val secondName: String
//        get(){
//            return field              // to give value like this, getter will create backing field. so not accepted.
//        }



    fun abstractFunction(name: String) // abstract function

    fun nonAbstractFunction(name: String){ // non-abstract function
        println("Non Abstract Function")
    }
}

/**
 * in kotlin, a class can implement one or more interface. if the interface have any abstract function or properties the class must be overridden it.
 */

class Class: Interface1{
    override var firstName: String= "faizal"

    override fun abstractFunction(name: String) {
        println(super.secondName)
    }

}

                                                            /* Interface Inheritance*/

/**
 * in kotlin, an interface can inherit one or more interface.
 * then, we can redeclare base class properties and function in derived class.
 */

interface Interface2{
    val fullName: String

    fun showFullName(fullName: String)
}

interface Interface3: Interface2{
    val firstName: String
    val secondName: String

    // this fullName property don't need to implement in class. bacz, it's firstname and secondName value is implement in class. so don't need to implement.
    override val fullName get() = "$firstName $secondName"

    // this function also don't need to implement in class. bacz, it's not a abstract function.
    override fun showFullName(fullName: String){
        println(fullName)
    }
}

class InterfaceClass: Interface3{
    override val firstName: String= "Syed"
    override var secondName: String= "Faizal"
}

                                                                /* Resolving overriding conflicts */

interface Interface4{
    val name: String
        get()="syed faizal"

    fun showTitle()

    fun showContent()

    fun showDescription(){
        println("Interface4 - Description")
    }
}

interface Interface5{
    val name: String
        get()="syed"

    fun showTitle(title: String)

    fun showContent()

    fun showDescription(){
        println("Interface5 - Description")
    }
}

class InterfaceExamples1: Interface4, Interface5{
    /**
     * in both interface have showContent abstract function, so we can override only one function.
     * but showTitle abstract function have different struct in both interface. so need to override both.
     * both interface have showDescription() non-abstract function, actually we don't need to override it. but both function have same name and struct. here
     * suppose by using instance of the class to call the interface4's showDescription() function, now we can't call it. bcaz outside the class we can't use super keyword.
     * so this case, we have to override the showDescription() function.
     */

    override val name: String
        get() = super<Interface4>.name



    override fun showTitle() {
        println("Default Title")
    }

    override fun showTitle(title: String) {
        println(title)
    }

    override fun showContent() {
        super<Interface4>.showDescription()
        super<Interface5>.showDescription()
    }

    override fun showDescription() {
        super<Interface4>.showDescription()
        super<Interface5>.showDescription()
    }
}