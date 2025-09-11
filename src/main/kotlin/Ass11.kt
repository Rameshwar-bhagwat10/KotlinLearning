class Person(val name: String, val age: Int) {

    init {
        println("Welcome, $name!")
    }

    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val p1 = Person("Rameshwar", 20)
    p1.displayInfo()
}
