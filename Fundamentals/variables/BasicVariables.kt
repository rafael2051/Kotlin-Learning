//Read-only variables are declared with val
//Mutable variables are declared with var

fun main(){

    //Kotlin compiler makes inferece type
    val x = 5

    //You can explicitly declare the type, but compiler
    //would infer
    val y:Int = 8

    println(x + y)

    //Cannot change values from read-only variables
    //x = 6 -> error

    var mutableValue = "Hello"

    //Now is possible to change the value of this variable
    mutableValue += "!"
    println(mutableValue)
    
}