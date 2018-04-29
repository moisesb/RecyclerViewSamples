package net.moisesborges.solution.step1_implement_recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.task_view_item.view.*

class TaskViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(task: Task) {
        itemView.descriptionTextView.text = task.description
        itemView.completedCheckBox.isChecked = task.completed
    }
}