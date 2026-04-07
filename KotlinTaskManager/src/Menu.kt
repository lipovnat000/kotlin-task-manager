class Menu(
    private val title: String,
    private val options: List<String>
) {

    fun display() {
        println("\n$title")
        println("-".repeat(title.length))

        // Print numbered options
        for ((index, option) in options.withIndex()) {
            println("$index. $option")
        }
    }


    fun select(): Int {
        print("\nMake a selection: ")

        // Read and validate input
        while (true) {
            val input = readlnOrNull()

            val choice = input?.toIntOrNull()
            if (choice != null && choice in options.indices) {
                return choice
            }

            print("Invalid selection. Try again: ")
        }
    }
}

