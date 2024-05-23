package Types.BasicTypes

fun main(){
    var arrayExamples = ArrayExamples()
    arrayExamples.arrayBasics()
    arrayExamples.creatingVariousArray()
    arrayExamples.nestedArray()
    arrayExamples.compareArrays()
    arrayExamples.arrayTransform()
    arrayExamples.primitiveTypeArray()

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
        var mtArray: Array<String> = emptyArray()   // What is the differance b/w this and below ?
        var mtArray1: Array<String> = arrayOf()
    }
    fun nestedArray(){
        // Creates a two-dimensional array
        val twoDArray = Array(2) {Array<Int>(2) {0} }
        twoDArray.forEach {
            print("\n")
            it.forEach {
                print(it)
            }
        }

        print("\n")
        // Create a three-dimensional array
        val threeDArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
        println(threeDArray.contentDeepToString()) // contentDeepToString() used to convert multidimensional to string

    }

    fun accessAndModifyElements(){
        //Arrays are always mutable. To access and modify elements in an array, use the indexed access operator[]

        val simpleArray = arrayOf(1, 2, 3)
        val twoDArray = Array(2) { Array<Int>(2) { 0 } }

        // Accesses the element and modifies it
        simpleArray[0] = 10
        twoDArray[0][0] = 2

        // Prints the modified element
        println(simpleArray[0].toString()) // 10
        println(twoDArray[0][0].toString()) // 2
    }

    fun varargConcept (){

    }

    fun compareArrays(){
        // To compare two arrays use .contentEquals(), .contentDeepEquals()
        val arrayOne = arrayOf(1,2,3,4)
        val arrayTwo = arrayOf(1,2,4)

        // using .equals function to compare two arrays
        println(arrayOne.equals(arrayOne))
        //using .contentEquals() function to compare tow arrays
        println(arrayOne.contentEquals(arrayTwo))

        val twoDArray1 = Array(2) { Array<Int>(2) { 0 } }
        val twoDArray2 = Array(2) { Array<Int>(2) { 0 } }
        //using .contentDeepEquals() to compare multidimenional array
        println(twoDArray1.contentDeepEquals(twoDArray2)) // true
        println(twoDArray1.equals(twoDArray2)) // .equals() function return false. it's not working

        val t = "faizal"
        println(t.contentEquals("faizal"))  // contentEquals also work for string
    }

    fun arrayTransform(){
        /*
        * The below contents only contains some of them . The below url have all
        * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/
        * */

        val array= arrayOf(3,2,1)
        println(array.sum()) // it's return the sum of all elements in array

        array.shuffle() // to randomly shuffle the elements in an array, use the .shuffle()
        println(array.joinToString())


        // convert arrays to collections

        // Convert to list or set

        val sampleArray= arrayOf("faizal", "basha", "syed", "ashik", "ameer")

        println(sampleArray.toList()) // convert the array to List
        println(sampleArray.toSet()) // convert the array to set

        // We can convert the array into map
           // while the array should be pairArray

        val pairArray= arrayOf(1 to "faizal", 2 to "ashik", 4 to "ashik", 3 to "faizal")
        // Converts to a Map
        // Note: keys must be unique, value can duplicate.
        println(pairArray.toMap())

    }

    fun primitiveTypeArray(){
        val booleanArray = BooleanArray(3)
        println(booleanArray.joinToString())

        val byteArray= arrayOf<Byte>(4,5,127)
        println(byteArray.joinToString())

        val charArray= arrayOf<Char>('o','9','8')
        println(charArray.joinToString())

        val stringArray= arrayOf<String>("faizal","syed")
        println(stringArray.joinToString())

        // you can also create array with long, short, float, double primitive types
    }




}