//With this you can define what an operator does over some class.
//In this example, times that is the "*" operator is being
//defined over the String class.
operator fun String.times(other: Int) = this.repeat(other)

fun main() {
    println("Oi " * 5)
}