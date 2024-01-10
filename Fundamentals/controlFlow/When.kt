//In kotlin when is similar to switch case in other languages
//It is recommended that you use when instead of if

class MyClass

fun whenExpression(obj: Any?){
    when(obj){
        is Int -> println("Watch the integer $obj")
        is Long -> println("Watch the long $obj")
        is String -> println("Watch the string $obj")
        is Float -> println("Watch the float $obj")
        is Double -> println("Watch the double $obj")
      	null -> println("Watch the null")
        else -> println("Unknown object")
    }
}

fun whenStatement(obj: Any?): Any?{
    return when(obj){
        is Int -> 10
        is Long -> 100
        is String -> "String!"
        is Float -> 100.33
        is Double -> 1000.33
      	null -> null
        else -> "Unknown"
    }
}

fun main() {
    
    println("when expression: ")
    whenExpression(1)
    whenExpression(1L)
    whenExpression("Oi")
    whenExpression(3.14F)
    whenExpression(3.14)
    whenExpression(null)
    whenExpression(MyClass())
    
    println("when statement: ")
    println(whenStatement(1))
    println(whenStatement(1L))
    println(whenStatement("Oi"))
    println(whenStatement(3.14F))
    println(whenStatement(3.14))
    println(whenStatement(null))
    println(whenStatement(MyClass()))
}