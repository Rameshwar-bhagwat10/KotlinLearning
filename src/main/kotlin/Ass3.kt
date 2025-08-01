package org.example

class Student(val name: String, val roll: Int, val marks: Int) {
    fun calculateGrade(): String {
        return when {
            marks >= 75 -> "A"
            marks >= 50 -> "B"
            else -> "C"
        }
    }
}

fun main() {
    val student1 = Student("Ravi", 1, 85)
    val student2 = Student("Meera", 2, 68)
    val student3 = Student("Amit", 3, 42)

    println("${student1.name} (Roll ${student1.roll}) Grade: ${student1.calculateGrade()}")
    println("${student2.name} (Roll ${student2.roll}) Grade: ${student2.calculateGrade()}")
    println("${student3.name} (Roll ${student3.roll}) Grade: ${student3.calculateGrade()}")
}
