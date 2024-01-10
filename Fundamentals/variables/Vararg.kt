//Using the special keyword vararg before an argument of a function
//allows you to pass as many values as you want
fun sumAll(vararg numbers: Int): Int{
    var ans:Int = 0
    for(n in numbers){
        ans = ans + n
    }
    return ans
}

fun multiplyAll(vararg numbers: Int) : Int{
    var ans:Int = 1
    for(n in numbers){
        ans *= n
    }
    return ans
}

fun printWords(vararg words: String){
    for(word in words){
        print("$word ")
    }
    println(".")
}

fun max(vararg numbers: Int): Int{
    var max:Int = 0
    for(n in numbers){
        if(n > max)
        	max = n
    }
    return max
}

fun main() {
    println("Sumall: ${sumAll(2, 4, 6, 7)}")
    println("MultiplyAll: ${(multiplyAll(2, 4, 7))}")
    println("MultiplayAll + SumAll: ${sumAll(multiplyAll(2,4), sumAll(5, 3))}")
    printWords("Olá", "seja", "muito", "bem", "vind")
    println(max(5, 7, 4, 3, 7, 8, 9, 10, 6, 7))
}