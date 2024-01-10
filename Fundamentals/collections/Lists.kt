fun main() {
    val listOfInts = listOf(1, 7, 5, 3, 2)
    println(listOfInts)
    println(listOfInts.sumOf{x -> x})
    val names = mutableListOf("John", "Stephanie", "Willian")
    val namesView: List<String> = names
    for(name in namesView){
        print("$name ")
    }
    println()
    names.add("Kate")
    namesView.forEach{
        name -> print("$name ")
    }
    println()
    print("names === namesView: ")
    println(names === namesView)
}