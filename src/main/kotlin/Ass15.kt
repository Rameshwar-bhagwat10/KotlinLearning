fun main() {
    val countryCapitals = mapOf(
        "India" to "New Delhi",
        "USA" to "Washington",
        "Japan" to "Tokyo"
    )
    println("Immutable Map: $countryCapitals")
    println("Cannot add to immutable map because it is read-only.")

    val mutableCountryCapitals = mutableMapOf(
        "India" to "New Delhi",
        "USA" to "Washington",
        "Japan" to "Tokyo"
    )

    mutableCountryCapitals["Germany"] = "Berlin"
    mutableCountryCapitals["France"] = "Paris"

    mutableCountryCapitals["India"] = "Delhi"

    mutableCountryCapitals.remove("USA")

    println("Capital of Japan: ${mutableCountryCapitals["Japan"]}")

    println("\nUsing for loop:")
    for ((country, capital) in mutableCountryCapitals) {
        println("$country -> $capital")
    }

    println("\nUsing iterator:")
    val iterator = mutableCountryCapitals.entries.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        println("${entry.key} -> ${entry.value}")
    }
}
