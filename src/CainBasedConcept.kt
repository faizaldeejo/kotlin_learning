// chain base concepts

class json{
    var i: Int= 0
    fun add(): json{
        i++
        return this
    }
    override fun toString(): String{
        return "faizal"
    }
}

fun main() {
//     val Json = json()
//     Json.add().add().add()
    println(json().add().add().add().i)
}