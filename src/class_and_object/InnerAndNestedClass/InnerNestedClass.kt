package class_and_object.InnerAndNestedClass

fun main() {
    val outerClass= OuterClazz()
    val innerClass = outerClass.InnerClass()
    val  nestedClass = OuterClazz.NestedClass()

    println(outerClass is OuterClazz)  // Outer class is OuterClazz/ true
    //println(outerClass is OuterClazz.InnerClass)  // outer class is not innerClass // incomparable

    println(innerClass is OuterClazz.InnerClass) // inner class is InnerClass / true
    //println(innerClass is OuterClazz)  // inner class is not outerclass // incomparable

    println(nestedClass is OuterClazz.NestedClass)  // nested class is nestedclass // true
    //println(nestedClass is OuterClazz) // nested class is not outerclass // incomparable
}

class OuterClazz{
    val name= "syed faizal"

    inner class InnerClass{
        val name= "faizal"
        fun showName(){
            println(name)
        }
    }

    class NestedClass{
        val name= "srinath"
        fun showName(){
            println("$name")
        }
    }
}