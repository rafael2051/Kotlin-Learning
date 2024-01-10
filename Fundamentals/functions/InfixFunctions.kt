//Infix functions allow you to invoke the function in
//between 2 objects, such as a operator. It must be
//a extension function (functions added to a class) or
//a inner function. In this example, we are making a extension
//function to Int class
infix fun Int.pow(B: Int): Int{
    var ans: Int = this
    for(i in 1..B-1){
        ans = ans * this
    }
    return ans
}

infix fun Int.pitag(B: Int): Double = Math.sqrt( ((this pow 2) + (B pow 2)).toDouble() )

fun main() {
    
    println("Without interpolation of strings: ")
    print("3 pow 4 = ")
    println(3 pow 4)
    print("2 pow 8 = ")
    println(2 pow 8)
    print("4 pitag 5 = ")
    println(4 pitag 5)
    print("6 pitag 9 = ")
    println(6 pitag 9)

    println("Using interpolation of strings: ")
    println("3 pow 4 = ${(3 pow 4) + 2}")
    println("4 pitag 5 = ${4 pitag 5}")
}