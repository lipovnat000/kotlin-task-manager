fun main() {
    val taskList = TaskList()

    val mainMenu = Menu(
        title = "Main Menu",
        options = listOf(
            "Quit the Program",
            "See all tasks",
            "Add a task",
            "Remove a task",
            "Edit tasks"
        )
    )

    val editMenu = Menu(
        title = "Edit Tasks",
        options = listOf(
            "Return to Main Menu",
            "Edit task due date",
            "Edit task name"
        )
    )

    // Main program loop
    while (true) {
        mainMenu.display()
        when (mainMenu.select()) {

            0 -> {
                println("Goodbye!")
                return
            }

            1 -> taskList.display()

            2 -> {
                println("Task name:")
                val name = readln()

                println("Description:")
                val description = readln()

                println("Due date:")
                val dueDate = readln()

                taskList.add(Task(name, description, dueDate))
                println("Task added!")
            }

            3 -> {
                taskList.display()
                println("Which task number would you like to remove?")
                val index = readln().toIntOrNull()

                if (index != null) {
                    taskList.remove(index)
                } else {
                    println("Invalid input.")
                }
            }

            4 -> {
                taskList.display()
                println("Which task number would you like to edit?")
                val index = readln().toIntOrNull()

                val task = taskList.get(index ?: -1)
                if (task != null) {
                    task.edit()
                } else {
                    println("Invalid task number.")
                }
            }

        }
    }
}
