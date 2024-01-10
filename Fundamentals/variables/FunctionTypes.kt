//In kotlin, functions can be stored in variables,
//and each function has a type. The type of
//a function is defined by that type of arguments
//it receives and the type of return.
val lowercase:(String) -> String = {string -> string.lowercase()}


//This is a function that returns a lambda expression which receives a double
//and return a double
fun convertToDolar(money: String): (Double) -> Double = when(money){
    "Real" -> {x -> x / 4.92}
    "Euro" -> {x -> x / 0.92}
    "Libra" -> {x -> x / 0.79}
    "Rublo" -> {x -> x / 91.97}
    else -> {x -> x}
}

fun main() {
    println(lowercase("OI"))
    val valoresReal = listOf(5.67, 80.0, 90.0, 141.0, 156.7)
    val realToDolar = convertToDolar("Real")
    val valoresDolar = valoresReal.map(realToDolar)
    println(valoresDolar)
    println({number: Int -> number.dec()}(10))
    println(listOf(1, 4, 10).fold(0, {x, item -> x + item}))
}