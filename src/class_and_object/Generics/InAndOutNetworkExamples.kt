package class_and_object.Generics

fun main() {
    val loginStatus: Success = getLoginStatus()
}


open class NetworkCall

class Loading: NetworkCall()

class Failed: NetworkCall()

class Exception: NetworkCall()

class SectionOut: NetworkCall()

class Success: NoData, AvailableData

interface NoData

interface AvailableData

enum class NetworkStatus{
    LOADING, FAILED, EXCEPTION, SECTION_OUT, SUCCESS
}

fun getLoginStatus():Success{
    return Success()
}

