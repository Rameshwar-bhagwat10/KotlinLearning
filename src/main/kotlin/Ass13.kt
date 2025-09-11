data class Student(val name: String, val age: Int, val company: String)

fun main() {
    // Immutable list
    val studentsImmutable = listOf(
        Student("Rameshwar", 20, "TCS"),
        Student("Sneha", 21, "Infosys"),
        Student("Rahul", 22, "Wipro"),
        Student("Priya", 23, "Google"),
        Student("Amit", 24, "Amazon")
    )

    println("Immutable List of Students: $studentsImmutable")

    // ❌ studentsImmutable.add(Student("Kiran", 25, "Microsoft"))  // ERROR
    println("Cannot add to immutable list because it is read-only.")

    // Mutable list
    val studentsMutable = mutableListOf(
        "Rameshwar",
        "Sneha",
        "Rahul",
        "Priya",
        "Amit"
    )

    // Add 2 new names
    studentsMutable.add("Kiran")
    studentsMutable.add("Meena")

    // Update name at index 1
    studentsMutable[1] = "Sonal"

    // Remove a name by value
    studentsMutable.remove("Rahul")

    // Retrieve and print name at index 2
    println("Name at index 2: ${studentsMutable[2]}")

    println("\nPrinting mutable list using for loop:")
    for (name in studentsMutable) {
        println(name)
    }

    println("\nPrinting mutable list using iterator:")
    val iterator = studentsMutable.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
