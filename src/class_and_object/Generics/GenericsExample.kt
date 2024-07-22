package class_and_object.Generics


// without using Generics.

/**
 Imagine you have four remote controls at home: two for the TV and two for the AC. Among them,
 one TV remote and one AC remote are broken. You want to request the working remote from anyone sitting near one.

 In real life, if someone sits near a remote, you ask them for it.

 Now, your friend Abhilash sits near the TV remote, and Sourabh sits near the AC remote.
 To use the remotes, you need to check their types and cast them

 why we need to check?(without Generic)
    All TVRemote, ACRemote both class extends Remote Explicitly, and BrokenTVRemote, BrokenACRemote class extends Remote Implicitly, so we have to check it's type for use the correct one.

 we don't need to check(with Generic)
    Bcaz, we only get what we gave,
    
 */
fun main() {
    // without Generic
    val abhilash = PersonSatDownNearRemoteWithOutGeneric(TVRemote())
    val remote1 = abhilash.pleaseGiveMeRemote()
    if (remote1 is TVRemote){
        remote1.onRedButtonClicked()
    }

    val sourabh = PersonSatDownNearRemoteWithOutGeneric(ACRemote())
    val remote2 = sourabh.pleaseGiveMeRemote()
    if (remote2 is ACRemote){
        remote2.onONOFFButtonClicked()
    }

    // With Generic

    val abhilash1 = PersonSatDownNearRemote(TVRemote())
    val remote3 = abhilash1.pleaseGiveMeRemote()
    remote3.onRedButtonClicked()


    val sourabh1 = PersonSatDownNearRemote(ACRemote())
    val remote4 = sourabh1.pleaseGiveMeRemote()
    remote4.onONOFFButtonClicked()

}


// without using Generic
class PersonSatDownNearRemoteWithOutGeneric(private val remote: Remote) {
    fun pleaseGiveMeRemote(): Remote = remote
}

// using with Genric
class PersonSatDownNearRemote<T>(private val remote: T) {
    fun pleaseGiveMeRemote(): T = remote
}




open class Remote {
    override fun toString(): String = "Remote"
}

open class TVRemote : Remote() {
    override fun toString(): String = "TV Remote"

    open fun onRedButtonClicked(){
        println("TV turns ON or OFF")
    }
}

open class ACRemote : Remote() {
    override fun toString(): String = "AC Remote"

    open fun onONOFFButtonClicked(){
        println("AC turns ON or OFF")
    }
}

class BrokenTVRemote : TVRemote() {
    override fun toString(): String = "Broken TV Remote"

    override fun onRedButtonClicked() {
        println("TV doesn't turn ON or OFF")
    }
}

class BrokenACRemote : ACRemote() {
    override fun toString(): String = "Broken AC Remote"

    override fun onONOFFButtonClicked(){
        println("AC doesn't turn ON or OFF")
    }
}