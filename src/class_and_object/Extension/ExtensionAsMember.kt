package class_and_object.Extension

/**
 * in kotlin, we can declare extension function for a class inside another class.
 */


class Radio{
    fun play(){
        println("Na ready tha vara va.")
    }
}

class Car(val radio: Radio){

    fun driveCar(){
        println("Car driving")
    }

    fun Radio.songDetails(){
        println("moveName: Leo")
        println("duration: 4.44")
    }
}

fun main(){
    Radio().play()
/*    Radio().songDetails()
    Car(Radio()).songDetails()*/
}