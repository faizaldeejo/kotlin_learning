package class_and_object.Extension


fun main() {
    printClassName(Circle()) // here, Circle class is extend Shape so, it's accepted.
    printClassName(Rectangle() as Shape)// here Rectangle extends Shape so, we can convert subclass to superclass
    printClassName(Square())
    printRect(Rectangle())
    //printRect(Shape()) // required type is Rectangle (superclass never cast to subclass)
    //printRect(Shape() as Rectangle) // it's also no work superclass never cast to subclass
}

/**
 * here, each class has extension function.
 * Rectangle class extend Shape class. so actually Rectangle class type is Rectangle and also Shape.(subclass is also superclass)
 * but superclass is never subclass.
 * up cast - when the subclass  cast to superclass it's know as up cast
 * down case - whe the superclass case to subclass its know as down cast
 */

open class Shape
class Rectangle : Shape()
class Circle : Shape()
class Square : Shape()

fun Shape.getName() = "Shape"
fun Rectangle.getName() = "Rectangle"
fun Circle.getName() = "Circle"
fun Square.getName() = "Square"

fun printClassName(s: Shape) { // here receiving data type is Circle, but Circle class is extend Shape class (subclass is also superclass)
    println(s.getName())       // receiving type is Circle, but it's actually call Shape's extension function. here, receiver type is Shape
}
fun printRect(r: Rectangle) { // here receiving data type is Shape, required data type is Rectangle, actually Rectangle extends Shape class.(superclass is never cast to subclass)
                                // so, it's throws ClassCastException exception.
    println(r.getName())
}

val shape: Shape = Shape()
//val rectangle: Rectangle = shape // here, we try to cast superclass to subclass, but it's never cast.

val shape1: Shape = Rectangle() // here, we try to cast subclass to superclass
//val rectangle: Rectangle = shape1 // here we try to cast superclass to subclass, but it's reject (superclass never cast to subclass)
/**
 * here, actually shape1 type is Shape, but its contain Rectangle so, by using as operator to cast it. it will accept. only down cast will work this much of scenarios.
 */
val rectangle: Rectangle = shape1 as Rectangle


