fun main() {
    var choice: String

    do {
        var count = 10
        while (count >= 1) {
            println(count)
            count--
            Thread.sleep(500) // optional delay (0.5 sec)
        }
        println("Countdown finished!")

        print("Do you want to restart countdown? (yes/no): ")
        choice = readLine()!!.lowercase()
    } while (choice == "yes")

    println("Program ended.")
}
