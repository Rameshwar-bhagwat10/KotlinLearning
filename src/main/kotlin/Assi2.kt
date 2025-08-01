package org.example

fun printLength(str: String?) {
    if (str != null) {
        println("Length of the string: ${str.length}")
    } else {
        println("String is null")
    }
}

fun main() {
    val nonNullString: String? = "Kotlin"
    val nullString: String? = null

    printLength(nonNullString)
    printLength(nullString)
}
