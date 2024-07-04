package class_and_object.DataClass

// Copy() function
/**
 * Use the .copy() function to copy an object, allowing you to alter some of its properties while keeping the rest unchanged.
 *
 * without copy() function the rest instance also takes the changes.
 */

data class DataClassEx(var name: String, val age: Int)


fun main() {
     //without using copy() function
     //actually, i'm change the properties value in 'datacClassInsatance' but it's reflect 'dataClassInstance1'

    val dCI = DataClassEx("syed basha", 28)
    println(dCI.toString())
    val dCI1 = dCI
    dCI.name = "syed ameer"
    println(dCI1.toString())

    //with using copy() function
    // by using copy() function, we can make a copy of the instance. it won't affect the original instance.

    val dCI2= DataClassEx("syed faizal",24)
    println(dCI2.toString())
    val dCI3= dCI2.copy()
    dCI2.name= "syed ameer"
    println(dCI3.toString())


    checkToCollection()
    checkToArray()
    checkToPrimitive()

}

fun checkToCollection(){
    // clone() function is like copy() function

    // without clone() function

    val numList= arrayListOf<Int>(23,45,56,77,33,45,67)
    println(numList)
    val numList1= numList
    numList[0]= 0
    println(numList1)

    // with clone() function

    val numList2= arrayListOf<Int>(23,45,56,77,33,45,67)
    println(numList2)
    val numList3= numList2.clone()
    numList2[0]= 0
    println(numList3)
    println(numList2)

}

fun checkToArray(){
    //without clone() function

    val numList= arrayOf<Int>(23,45,56,77,33,45,67)
    numList.forEach {
        print("$it, ")
    }
    println()
    val numList1= numList
    numList[0]= 0
    numList1.forEach {
        print("$it, ")
    }
    println()

    // with clone() function

    val numList2= arrayOf<Int>(23,45,56,77,33,45,67)
    numList2.forEach {
        print("$it, ")
    }
    println()
    val numList3= numList2.clone()
    numList2[0]= 0
    numList3.forEach {
        print("$it, ")
    }
}

fun checkToPrimitive(){
    println()
    var name: String= "syed faizal"
    println(name)
    val name1= name
    name= "syed ameer"
    println(name1)


}