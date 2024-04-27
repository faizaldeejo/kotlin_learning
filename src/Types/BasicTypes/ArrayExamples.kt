package Types.BasicTypes

fun main(){
    var arrayExamples = ArrayExamples()
    arrayExamples.arrayBasics()
    arrayExamples.creatingVariousArray()

}

class ArrayExamples {
    init {
        // The Array constructor takes the array size and a function that returns values for array elements given its index:

        // Creates an Array<Int> that initializes with zeros [0, 0, 0]
        val initArray = Array<Int>(3) { 0 }
        println(initArray.joinToString())
        // 0, 0, 0

        // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { print(it) }
        // 014916
    }

    init {

    }

    fun arrayBasics(){
        //An array is a data structure that holds a fixed number of values of the same type or its subtypes.
        /*
        * The only way to add or remove elements from an array is
        * to create a new array each time, which is very inefficient. arrays are fixed in size.
        * n comparison, It is easy to add or remove elements from collections.
        * */

        val studentName = Array<String>(5){"syed"} //by default, its take the value to it's all index
        for (value in studentName)
            println(value)

        var markList = arrayOf(55,84,70,90,68)
        markList[0] = 100 // we can change value's in existing index.
        //markList[5] = 40 // we can't add new values and delete existing values
        println(markList.size)
        // Using the += assignment operation creates a new markList,
        // copies over the original elements and adds "66"
        markList += 66
        println(markList.size)
        //print(markList) // we can't directly print arrays. instead of using loop or joinTostring()
        println(markList.joinToString()) // it's just take the array's value then give it string formate
        val t = markList.joinToString()
    }

    fun creatingVariousArray(){
        // To create arrays in Kotlin, you can use: // arrayOf(),arrayOfNulls(), emptyArray()
        // arrayOf()
        val simpleArray = arrayOf(1,2,3,4)
        println(simpleArray.joinToString())

        //arrayOfNulls()
        val nullArray: Array<Int?> = arrayOfNulls(5) // here you have to give array's type
        println(nullArray.joinToString())

        // emptyArray() //You can specify the type of the empty array on the left-hand or right-hand side
       // var mtArray = emptyArray<String>()
        var mtArray: Array<String> = emptyArray()
    }



}