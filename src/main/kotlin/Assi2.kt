fun printLength(name: String?) {
    if (name != null) {
        println("Length is: ${name.length}")
    } else {
        println("null")
    }
}

fun main() {
    val name: String = "Rameshwar"
    val nullname: String? = null

    printLength(name)
    printLength(nullname)
}
