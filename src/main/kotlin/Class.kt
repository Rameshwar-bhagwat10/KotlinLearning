open class Employee {
    private var salary: Int = 190000
    public var name = "Rameshwar"
    open protected val city = "Yeola"  // ✅ Now accessible in subclass
    internal val age = 19
}

class Manager : Employee() {
    val managerName=name
    val managerCity = city  // ✅ Works now
    val managerAge = age
    fun showname(){
        println("Manager's city: $managerName")
    }
    fun showCity() {
        println("Manager's city: $managerCity")
    }
    fun showage(){
        println("Manager's Age: $managerAge")
    }
}
fun main(args:Array<String>) {
//    lateinit var myName: String
//    myName = "Ram"
//    println(myName)
//
//    val employee = Employee()
//    println(employee.name)

    val manager = Manager()

    manager.showname()
    manager.showCity()
    manager.showage()

}
