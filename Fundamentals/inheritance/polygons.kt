open class Polygon(val n: Int, val sides: List<Int>){
    open fun kind(){
        print("This is a polygon with $n sides of size: ")
        for(side in sides){
            print("$side ")
        }
        println()
    }
}

class Triangle private constructor(n: Int, sides:List<Int>, val type:String) : Polygon(n=n, sides=sides){
    constructor(sides: List<Int>) : this(3, sides, "triangle"){
    }
    override fun kind(){
        print("This is a $type with sides of size: ")
        for(side in sides){
            print("$side ")
        }
        println()
    }
}

class Rectangle private constructor(n: Int, sides: List<Int>, val type:String) : Polygon(n=n, sides=sides){
    constructor(sides: List<Int>) : this(4, sides, "rectangle"){
    }
    override fun kind(){
        print("This is a $type with sides of size: ")
        for(side in sides){
            print("$side ")
        }
        println()
    }
}

fun createPolygon(vararg lengths: Int): Polygon{
    var count = 0
    var sides:MutableList<Int> = mutableListOf()
    for(length in lengths){
        sides.add(length)
        count++
    }
    return when(count){
        3 -> Triangle(sides)
        4 -> Rectangle(sides)
        else -> Polygon(count, sides)
    }
}

fun main(){
    val square = createPolygon(5, 5, 5, 5)
    val triangle = createPolygon(4, 6, 11)
    val hexagon = createPolygon(6, 7, 5, 4, 3, 5)
    square.kind()
    triangle.kind()
    hexagon.kind()
}