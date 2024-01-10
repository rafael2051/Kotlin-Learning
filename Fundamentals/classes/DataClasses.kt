data class vec2(val x: Int, val y: Int){
    operator fun plus(other: vec2): vec2{
        return vec2(this.x + other.x, this.y + other.y)
    }
}

data class ThreeDpoint(var x:Int, var y:Int, var z:Int){
 	operator fun plus(other: ThreeDpoint): ThreeDpoint{
        return ThreeDpoint(this.x + other.x, this.y + other.y,
                          	this.z + other.z)
    }
    operator fun minus(other: ThreeDpoint): ThreeDpoint{
        return ThreeDpoint(this.x - other.x, this.y - other.y,
                          	this.z - other.z)
    }
    operator fun times(other: ThreeDpoint): ThreeDpoint{
        return ThreeDpoint(this.x * other.x, this.y * other.y,
                          	this.z * other.z)
    }
    operator fun div(other: ThreeDpoint): ThreeDpoint{
        return ThreeDpoint(this.x / other.x, this.y / other.y,
                          	this.z / other.z)
    }
}

fun main() {
    println("Data classes:")
    println("Vec: ${vec2(3, 4) + vec2(4, 3)}")
    val result = vec2(4, 5) + vec2(5, 4)
    println(result)
    val point = ThreeDpoint(5, 4, 1)
    println("point: $point")
    val anotherPoint = ThreeDpoint(8, 6, 3)
    println("anotherPoint: $anotherPoint")
    print("point + anotherPoint: ")
    println(point + anotherPoint)
    print("point - anotherPoint: ")
    println(point - anotherPoint)
    print("point * anotherPoint: ")
    println(point * anotherPoint)
    print("point / anotherPoint: ")
    println(point / anotherPoint)
}