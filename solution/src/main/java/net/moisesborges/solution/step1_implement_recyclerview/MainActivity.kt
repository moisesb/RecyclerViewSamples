package net.moisesborges.solution.step1_implement_recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.moisesborges.solution.App
import net.moisesborges.solution.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val app = applicationContext as App
        // Step 4 - Set the adapter
        val listOfTasks = app.createTasks()
        val tasksAdapter = TasksAdapter()
        tasksRecyclerView.adapter = tasksAdapter
        tasksAdapter.updateTasks(listOfTasks)
    }


}
