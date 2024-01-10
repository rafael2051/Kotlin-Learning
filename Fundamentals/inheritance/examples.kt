open class A(val a: Int){
    open fun isEven(): Boolean{
        return a % 2 == 0
    }
}

class B(a: Int): A(a=a){
    fun newFunction(){
        println("New function in B")
    }
}

fun main(){
    val x = B(2)
    val y: B = B(3)
    val z: A = B(4)
    val w = A(5)
    val t: A = A(6)
    println(x.isEven())
    x.newFunction()
    println(y.isEven())
    y.newFunction()
    println(z.isEven())
    //z.newFunction() -> compilation error
    println(w.isEven())
    println(t.isEven())
}