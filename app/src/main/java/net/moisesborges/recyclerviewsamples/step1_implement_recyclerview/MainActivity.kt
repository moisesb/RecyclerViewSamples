package net.moisesborges.recyclerviewsamples.step1_implement_recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import net.moisesborges.recyclerviewsamples.App
import net.moisesborges.recyclerviewsamples.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val app = applicationContext as App

        val listOfTasks = app.createTasks()
    }
}
