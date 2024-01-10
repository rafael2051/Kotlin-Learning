//Here is also example of for loops and if statements

fun main() {

    //In each iteration, assign a number from
    //1..4 to i. This sintax includes 4.
    for(i in 1..4){
        print("$i ")
    }
    println()

    //Until excludes 4
    for(i in 1 until 4){
        print("$i ")
    }
    println()

    //In this case, "in" operator is used in a boolean expression
    val j: Int = 1
    print("j is in range 1..4: ")
    println(j in 1..4)
    print("j is not in range 2..4: ") 
    println(j !in 2..4)

    //downTo decreases i in each iteration, and includes 1
    for(i in 4 downTo 1){
        print("$i ")
    }
    println()
    for(i in 1..8 step 3){
        print("$i ")
    }
    println()

    //Can be used with chars also
    for(i in 'a'..'z'){
        print("$i ")
    }
    println()
    for(i in 'a'..'z' step 2){
        print("$i ")
    }
    println()
    println((1..5).sumOf{x -> x})
}