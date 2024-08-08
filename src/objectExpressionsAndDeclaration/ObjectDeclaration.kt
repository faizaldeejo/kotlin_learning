package objectExpressionsAndDeclaration

/**
 * In kotlin, object declaration is 'Singleton', which means it's instance will create only one time.
 * it's having no constructors.
 * it's common for entire project.
 * when we make alter in one instance. it will reflect in another.
 * An object Declaration can extends class or interface.
 */

fun main(){

    val objectDeclaration1 = ObjectDeclaration
    val objectDeclaration2 = ObjectDeclaration

    println(objectDeclaration1.name)
    objectDeclaration1.name= "syed"
    println(objectDeclaration2.showName())

    if(objectDeclaration2 is ObjectDeclaration && objectDeclaration1 is Phone) println(true)
}

object ObjectDeclaration: Phone, PhoneClass(){
    var name: String = "faizal"

    fun showName() = name

    override fun phonePrice() {
        println("Phone Price is 25000 rs")
    }

    override fun phoneDisplay() {
        println("Phone have IPS Display")
    }
}

open class PhoneClass

interface Phone{
    fun phoneDisplay()
    fun phonePrice()
}