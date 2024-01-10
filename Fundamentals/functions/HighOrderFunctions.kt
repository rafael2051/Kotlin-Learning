fun doSomething(some: Any?, other: Any?, someOperation: (Any?, Any?) -> Any?): Any?{
    return someOperation(some, other)
}

fun concatenateTwoStrings(someString: Any?, otherString: Any?): Any?{
    return someString?.let{
        str1 -> otherString?.let{
            str2 -> "$str1$str2"
        } ?: "$someString"
    } ?: "$otherString"
}

fun main() {
	val string = doSomething("Oi", "Ola", ::concatenateTwoStrings)
    println(string)
    val otherString = doSomething("Ei", null, ::concatenateTwoStrings)
    println(otherString)
    val aString = doSomething(null, "Opa", ::concatenateTwoStrings)
    println(aString)
    val tryString = doSomething(null, null, ::concatenateTwoStrings)
    println(tryString)
}