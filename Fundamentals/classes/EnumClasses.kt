enum class Color{
    YELLOW, RED, BLUE, GREEN, PINK, VIOLET
}

fun main() {
    val values = Color.values().toList()
    val random = values.random()
    fun randomMsg(random: Color): String{
        return when(random){
        	Color.YELLOW -> "Yellow color"
            Color.RED -> "Red color"
            Color.BLUE -> "Blue color"
            Color.GREEN -> "Green color"
            Color.PINK -> "Pink color"
            Color.VIOLET -> "Violet color"
        }
    }
    val msg = randomMsg(random)
    println(msg)
}