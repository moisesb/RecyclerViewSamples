package net.moisesborges.solution.step1_implement_recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import net.moisesborges.solution.R

/**
 * Step 3 - Create an Adapter
 */
class TasksAdapter: RecyclerView.Adapter<TaskViewHolder>() {
    private val taskList: MutableList<Task> = mutableListOf()

    fun updateTasks(newTasks: List<Task>) {
        taskList.clear()
        taskList.addAll(newTasks)
        notifyDataSetChanged() // this method makes RecyclerView update itself
    }

    /**
     * Method responsible for inflate Item's layout and create the ViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        // inflate task_view_item, always set attachToRoot false because this layout will be attached
        // only when user scrolls to view's position
        val layout = LayoutInflater.from(parent.context)
                .inflate(R.layout.task_view_item, parent, false)
        return TaskViewHolder(layout)
    }

    /**
     * Method responsible to tell RecyclerView how many items should display
     */
    override fun getItemCount(): Int {
        return taskList.size
    }

    /**
     * Then the View becomes visible, this method should set the correct data.
     * In our example we set TextView text with task description and
     * CheckBox isChecked with task completed
     */
    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.bind(task)
    }
}