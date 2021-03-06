package net.moisesborges.solution

import net.moisesborges.solution.step1_implement_recyclerview.Task

/**
 * Class created only to provide mock results for Tests
 */
class TestApp : App() {

    override fun createTasks(): List<Task> {
        return (1..20).map { Task("Task $it", it < 10) }
    }
}