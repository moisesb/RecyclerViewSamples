package net.moisesborges.solution.step1_implement_recyclerview;

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.runner.AndroidJUnit4

import org.junit.runner.RunWith
import android.support.test.rule.ActivityTestRule
import android.support.v7.widget.RecyclerView
import android.widget.CheckBox
import net.moisesborges.solution.App
import net.moisesborges.solution.R
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.instanceOf
import org.junit.Rule
import org.junit.Test


@RunWith(AndroidJUnit4::class)
class BasicRecyclerViewTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun step0_launchTheApp_without_errors() {

    }


    @Test
    fun step1_addRecyclerViewDependency_andCreateTheRecyclerViewOnXmlLayout() {
        onView(withId(R.id.tasksRecyclerView))
                .check(matches(instanceOf(RecyclerView::class.java)))
    }

    @Test
    fun step2_createAndAttachAdapter_itShouldDisplayTheItems() {
        val app = activityRule.activity.applicationContext as App
        app.createTasks().forEachIndexed(this::scrollAndVerifyItem)
    }

    private fun scrollAndVerifyItem(index: Int, task: Task) {
        onView(withId(R.id.tasksRecyclerView))
                .perform(RecyclerViewActions.scrollToPosition<TaskViewHolder>(index))

        onView(withText(task.description))
                .check(matches(isDisplayed()))

        onView(allOf(hasSibling(withText(task.description)), instanceOf(CheckBox::class.java)))
                .check(matches(if (task.completed) isChecked() else isNotChecked()))
    }

}
