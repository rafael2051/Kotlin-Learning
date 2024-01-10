//toLowerCase is a read-only variable of type (String) -> String tjat
//holds a lambda function. The same to toUpperCase
val toLowerCase: (String) -> String = {string -> string.lowercase()}
val toUpperCase: (String) -> String = {string -> string.uppercase()}

//This function receives 2 functions of type (String) -> String as parameter
fun repeatNWithString(action1: (String) -> String, action2: (String) -> String, n: Int){
    var string = "OLA"
    for(i in 0..<n){
        when(i % 2){
            0 -> string = action1(string)
            1 -> string = action2(string)
        }
    }
    println(string)
}


fun main() {
    println({number: Int -> number.countLeadingZeroBits()}(100))
    val phoneNumbers = listOf(11948392835, 11958694839, 11959383839, 11964832710, 21972910493, 21948392012, 21938492910)
    val phoneNumbersSP = phoneNumbers.filter{number -> number < 21000000000}
    val phoneNumbersRJ = phoneNumbers.filter{number-> number > 21000000000}
    println("Numbers SP: ")
    for(number in phoneNumbersSP){
        println(number)
    }
    println("Numbers RJ: ")
    for(number in phoneNumbersRJ){
        println(number)
    }
    println()

    repeatNWithString(toLowerCase, toUpperCase, 6)
}