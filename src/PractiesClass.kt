                   //How to run it.
/*fun main(){
    PractiesClass()
}

class PractiesClass1(name: String) {
    init {
        initFunction()
        fun initFunction(){
            println(name)
        }
    }
}*/


class PractiesClass(name: String){
    init {
        println(name)
    }
    constructor(name: String, arg: String):this(name)
    init {
        println(name)
    }


}