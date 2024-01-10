fun main() {
    val fruitsCalories = mutableMapOf("Apple" to 100, "Banana" to 60, "Grape" to 10,
                        	"Cherry" to 15)
    val fruitsCaloriesView: Map<String, Int> = fruitsCalories
    fruitsCaloriesView.forEach {
        fruit, calories -> print("$fruit has $calories calories ")
    }
    println()
}