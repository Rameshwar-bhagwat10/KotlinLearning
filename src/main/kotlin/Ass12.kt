class Person(val name: String, val age: Int) {
    init {
        println("Welcome, $name!")
    }

    fun displayInfo() {
        println("Person -> Name: $name, Age: $age")
    }
}

class Employee(val name: String, val employeeId: Int) {
    constructor(name: String) : this(name, 0)

    fun showDetails() {
        println("Employee -> Name: $name, ID: $employeeId")
    }
}

class Car(val model: String) {
    var year: Int = 0

    constructor(model: String, year: Int) : this(model) {
        this.year = year
    }

    init {
        println("Car object created: Model = $model")
    }

    fun showCarInfo() {
        if (year != 0)
            println("Car -> Model: $model, Year: $year")
        else
            println("Car -> Model: $model, Year: Not specified")
    }
}

fun main() {
    val person = Person("Rameshwar", 20)
    person.displayInfo()

    val emp1 = Employee("Rahul", 101)
    val emp2 = Employee("Sneha")
    emp1.showDetails()
    emp2.showDetails()

    val car1 = Car("Tesla")
    val car2 = Car("BMW", 2023)
    car1.showCarInfo()
    car2.showCarInfo()
}
