package net.moisesborges.solution

import android.app.Application
import net.moisesborges.solution.step1_implement_recyclerview.Task

open class App: Application() {

    /**
     * Created only to make testing easier
     */
    open fun createTasks(): List<Task> {
        return listOf(
                Task("Add RecyclerView dependency", false),
                Task("Create a RecyclerView on XML layout", false),
                Task("Set LayoutManager", false),
                Task("Implement the Adapter", false)
        )
    }
}