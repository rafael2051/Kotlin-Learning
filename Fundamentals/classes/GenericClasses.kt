data class Employee(val code: Int, val name: String,
                    val job: String, val dpt: String)

class MutableStack<E>(vararg items: E){
    val stack:MutableList<E> = items.toMutableList()
    fun push(element: E) = stack.add(element)
    fun peek(): E = stack.last()
    fun pop(): E = stack.removeAt(stack.size - 1)
    fun checkIfIsEmpty() = stack.isEmpty()
    fun size() = stack.size
   	override fun toString() = "MutableStack(${stack.joinToString()})"
    operator fun iterator(): Iterator<E>{
        return stack.iterator()
    }
}

fun main() {
    val employees = MutableStack(Employee(1, "Michael", "Web developer", "IT"),
                                        Employee(2, "Sara", "Recruiter", "HR"),
                                        Employee(3, "George", "Devops", "IT"))
    println(employees)
    println("Element on index employees.size() - 1: ${employees.peek()}")
    println("Removing ${employees.pop()}")
    println(employees)
    val newEmployee = Employee(4, "Alex", "Backend developer", "IT")
    println("Adding $newEmployee")
    employees.push(newEmployee)
    println(employees)
    println("Is empty: ${employees.checkIfIsEmpty()}")
    println("Size: ${employees.size()}")
    
    //Testing the iterator in stackOfPoints
    for(employee in employees){
        println(employee)
    }
}