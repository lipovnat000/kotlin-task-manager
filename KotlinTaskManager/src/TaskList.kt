class TaskList(
    private val tasks: MutableList<Task> = mutableListOf()
) {

    fun display() {
        if (tasks.isEmpty()) {
            println("No tasks yet.")
            return
        }

        println("\nYour Tasks:")
        tasks.forEachIndexed { index, task ->
            println("$index. ${task.name}, ${task.dueDate}")
        }
    }

    fun add(task: Task) {
        tasks.add(task)
    }

    fun remove(index: Int) {
        if (index in tasks.indices) {
            tasks.removeAt(index)
        } else {
            println("Invalid task number.")
        }
    }

    fun get(index: Int): Task? {
        return tasks.getOrNull(index)
    }

    fun size(): Int = tasks.size
}
