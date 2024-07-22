package class_and_object.AbstractClasses

fun main(){

}

abstract class AbstractClasses1{
    abstract fun abstractFunction1()
}

abstract class AbstractClasses2: AbstractClasses1(){
    abstract fun abstractFunction2()
}

class AbstractClasses: AbstractClasses2(){
    override fun abstractFunction2() {
        TODO("Not yet implemented")
    }

    override fun abstractFunction1() {
        TODO("Not yet implemented")
    }

}