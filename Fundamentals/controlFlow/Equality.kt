fun main() {
    val someNumbers = setOf(3, 1, 5)
    val sameNumbers = setOf(1, 3, 5)

    //== is used for structural comparison, i.e, compare two
    //objects based on its equals() methods
    print("someNumbers == sameNUmers: ")
    println(someNumbers == sameNumbers)

    //=== is used for referencial comparison. i.e, checks if two
    //objects have the same address
    print("someNumbers === sameNumbers: ")
    println(someNumbers === sameNumbers)
}