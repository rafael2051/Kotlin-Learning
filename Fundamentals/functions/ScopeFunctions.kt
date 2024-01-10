infix fun Int.toBase(base: Int): String{
    var remainders = ""
    var x = this
    var result = remainders.let{
        while(x != 0){
        	remainders = remainders + (x%base).toString()
        	x = x / base
    	}
    }.let{
        remainders.reversed()
    }
    return result
}

fun main() {
	println(745 toBase 4)
    println(20 toBase 2)
}