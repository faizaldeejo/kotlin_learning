package class_and_object.EnumClass


/**
 * When the all enum constant added as a branches in when statement, here don't need to add else statement. otherwise, have to add else,
 */
fun main(){
    when(val condition = EnumWithCondition.CONDITION_1){
        EnumWithCondition.CONDITION_2 ->{ println("$condition")}
        EnumWithCondition.CONDITION_1 ->{ println("$condition")}
        EnumWithCondition.CONDITION_3 ->{ println("$condition")}
    }

    when(val condition = EnumWithCondition.CONDITION_3){
        EnumWithCondition.CONDITION_2 ->{ println("$condition")}
        EnumWithCondition.CONDITION_1 ->{ println("$condition")}
        else -> {println(condition)}
    }
}

enum class EnumWithCondition {
    CONDITION_1,
    CONDITION_2,
    CONDITION_3;
}