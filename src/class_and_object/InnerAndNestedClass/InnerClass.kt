package class_and_object.InnerAndNestedClass

fun main(){
    val outerClass= OuterClass1()
    val innerClass= outerClass.InnerClass("syed", "faizal")
    val innerClassInstance= innerClass.innerClassInstance()
}

class OuterClass1(){
    lateinit var fullName: String
    val age: Int= 24
    fun outerClassFunction(){
        println("outerClassFunction")
    }

    inner class InnerClass(firstName: String, secondName: String){
        init {
            fullName = "$firstName $secondName"
        }
        fun innerClassFunction(){
            println("innerClassFunction")
            outerClassFunction()
        }

        fun innerClassInstance(): InnerClass{
            return this@InnerClass
        }
    }
}