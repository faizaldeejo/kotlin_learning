package objectExpressionsAndDeclaration


/**
 * when the object expression declared as global in class .
 * we can't access object expression's own properties and outside scope.
 * In this case, by declare the private modifiers to object expression we can access the all properties inside the class.
 */

fun main(){

    val objExp1 = ObjectExpressionsReturn()

    val objExp2 = ObjectExpReturn()
    val objExp3 = ObjectExpReturn()

    /**
     * object expressions are not singleton. it means object expressions not unique for each objects.
     * i'm creating two instance to ObjectExpReturn class. then i'm changed object expression's name values in one instance.
     * it's not reflecting  another object. so it's not a singleton.
     */

    println(objExp2.getValue("faizal",true))
    println(objExp2.getValue("",false))
    println(objExp3.getValue("",false))

}


class ObjectExpressionsReturn{

    private val objExp1 = object{
        var name = "syed"
    }

    val objExp2= object{
        var name= "faizal"
    }

    // we declare the objExp1 in private, so we can access it.
    fun getObjExp1NameValues(): String = objExp1.name
    // we didn't declare the objExp2 private, so we can't access it.
    //fun getObjExp2NameValues(): String = objExp2.name

}

class ObjectExpReturn{

    private val objExp1 = object{
        var name = "syed"
    }

    fun getValue(name: String, change: Boolean): String {
        if(change){
            objExp1.name = name
            println("name value changed")
        }
        return objExp1.name
    }
}