package class_and_object

fun main(){
    FunctionalInterface()
    TypeAliasClass()
}

/**
 * An interface with only one abstract method is called a functional interface, or a Single Abstract Method (SAM) interface.
 * The functional interface can have several non-abstract members but only one abstract member.
 * To declare a functional interface in Kotlin, use the fun modifier.
 */

fun interface FunInterface{
    fun showTitle(title: String) // abstract
    //fun showTitle(title: String= "Title") // functional interface's single abstract functional we can't declare default value.
    //fun showContent() // we can't declare two abstract function inside the functional interface.
    fun showDescription(){ // we can declare one or more non-abstract function inside the functional interface.
        println("Description")
    }
}
                                                                    /* SAM conversions */
/**
 *  without sam conversions, you have to implement the interface to a class, then by the instance of the class we only access the interface's abstract function.
 *  with sam conversion, it simplifies above process.
 */

interface SamInterface{
    fun showTitle()
    fun showContent()
}

val samInterface= object : SamInterface{
    override fun showTitle() {
        println("title")
    }

    override fun showContent() {
        println("Content")
    }
}
                                                                    /*sam conversion for functional interface*/
/**
 * For functional interfaces, you can use SAM conversions that help make your code more concise and readable by using lambda expressions.
 */

val funInterface= FunInterface { println(it) } // the FunInterface's showTitle() function have only one argument, so we can access it with 'it' .

fun interface FunInterface1{
    fun showContent(title: String, description: String)
}

class FunIntClass(funInterface1: FunInterface1){
    init{
        funInterface1.showContent("Title", "Description")
    }
}

class FunctionalInterface{
    init {
        val funInterface1= FunInterface1{ title, description -> // the FunInterFace1's showContent() function have two arguments, so we have to declare here. (name is our wise)
            println("$title - $description")
        }

        FunIntClass(funInterface1)
    }
}



                                                        /* type aliases */
/**
 * here, we only declare one abstract function.
 * in type aliases, we don't need to declare the name of it's abstract function
 */
typealias TypeAlias  = (title: String, description: String) -> String

val typeAlias: TypeAlias= {title, description ->
                            "$title $description"
                            }

class TypeAliasClass{
    init{
        println(typeAlias("Title","Description"))
    }
}