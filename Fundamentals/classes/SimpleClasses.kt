//Object notation is used to define a singleton class
object Id{
    var nextId = 1
    fun getId(): Int{
        val currentId = nextId 
        nextId++
        return currentId
    }
}

//In kotlin, the parentheses after the class name is the header
//of the class, and is the default constructor. If you pass arguments
//to the header you will be defining what variables will be initialized
//during the instantiation
class Customer(val id:Int = Id.getId(), val name:String,
              	var phone:String? = null, var email:String? = null){
    fun buy(product:String){
        println("$name is buying $product")
    }
    fun printCustomerInfo(){
        println("id: $id, name: $name, phone: $phone, email: $email")
    }
}

fun main() {
    val listCustomers = listOf(Customer(name = "John"), Customer(name = "Mary"), 
                               Customer(name = "Paul"), Customer(name = "Zach"))
    for(customer in listCustomers){
        customer.printCustomerInfo()
    }
}