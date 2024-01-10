class UnderageVoterException(message: String): Throwable(message)

@Throws(UnderageVoterException::class)
fun vote(name: String?, age: Int?){
    age?.let{if(age < 16) throw UnderageVoterException("Minimum age requirement not cumplished by $name")}
    println("$name has voted with success")
}

fun main(){
    var name: String? = ""
    var age: Int? 
    var votes = 0
    while(name != "STOP"){
        print("Write the name of the voter: ")
        name = readLine()
        print("Write the age of the voter: ")
        age = readLine()?.toInt()
        if(name != "STOP"){
            votes += try{
                vote(name, age)
                1
            } catch(e: UnderageVoterException){
                e.printStackTrace()
                0
            }
        }
    }
    println(votes)
}