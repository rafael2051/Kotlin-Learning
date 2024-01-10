//Functions
//You can define simple functions as this one
//Always write "fun" to declare a new function,
//followeb by the name of the functions and
//the parameters in parenthesis
fun printMessageWithPrefix(prefix: String, message: String){
    println("$prefix$message")
}

//Let's try something more interesting, such as a recursive functions
//Here we are declaring the type of return for this function with the
//":Int" after the parameters
fun fibonacci(current: Int = 1, previous: Int = 1,
             n: Int = 1, end: Int): Int{
	return when(n){
        end -> current
        else -> fibonacci(current + previous, current,
                         n + 1, end)
    }
}

//Every application in kotlin must have a main function
//as a starting point
fun main() { 
    printMessageWithPrefix("bem-", "vindo")

    //Here we are using named parameters
    println(fibonacci(end = 24))
}