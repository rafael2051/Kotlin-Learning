fun main() {
    val library = mutableSetOf("LOTR", "HP", "Narnia", "GOT")
    val libraryView: Set<String> = library
    libraryView.forEach{
        book -> print("\"$book\" ")
    }
    println()
    print("Library size: ")
    println(libraryView.size)
	println("Add Percy Jackson on library: ${library.add("Percy Jackson")}")
    println("Add LOTR on library: ${library.add("LOTR")}")
    for(book in libraryView){
        print("\"$book\" ")
    }
    println()
}