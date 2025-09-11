fun main() {
    val numbers = mutableSetOf(1, 2, 3, 2, 4, 5, 3)
    println("Initial Set: $numbers")

    val added = numbers.add(2)
    println("Trying to add 2 again: $added, Set: $numbers")

    numbers.add(6)
    numbers.add(7)
    println("After adding 6 and 7: $numbers")

    if (numbers.remove(3)) {
        numbers.add(30)
    }
    println("After updating 3 to 30: $numbers")

    numbers.remove(4)
    println("After removing 4: $numbers")

    println("All elements in the set: $numbers")

    println("\nUsing for loop:")
    for (num in numbers) {
        println(num)
    }

    println("\nUsing iterator:")
    val iterator = numbers.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
