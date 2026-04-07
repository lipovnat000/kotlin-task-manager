class Task(
    var name: String,
    var description: String,
    var dueDate: String
) {

    fun display() {
        println(name)
        println(description)
        println(dueDate)
    }

    private fun editField(label: String, currentValue: String): String {
        val validInputs = setOf("Y", "N")
        var input: String
        var value: String

        println(currentValue)
        println("Would you like to edit the $label? Y/N")


        while (true) {
            input = readln().uppercase()
            if (input in validInputs) break
            println("Please enter Y or N")
        }

        if (input == "Y") {
            print("What is the new $label? : ")
            value = readln()
        } else {
            value = currentValue
        }

        return value
    }

    fun edit() {
        name = editField("name", name)
        description = editField("description", description)
        dueDate = editField("due date", dueDate)
    }
}
