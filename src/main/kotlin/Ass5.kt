class Car(val make: String, val model: String, val year: Int, var mileage: Double) {

    fun details() {
        println("Car Details:")
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
        println("Mileage: $mileage km")
    }

    fun drive(miles: Double) {
        mileage += miles
        println("Driven $miles km")
    }
}

fun main() {
    val car = Car("Toyota", "Camry", 2020, 25000.0)

    car.details()

    car.drive(500.0)

    println("Updated Details:")
    car.details()
}
