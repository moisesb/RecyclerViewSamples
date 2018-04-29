package net.moisesborges.recyclerviewsamples.step1_implement_recyclerview

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.widget.CheckBox
import net.moisesborges.recyclerviewsamples.App
import net.moisesborges.recyclerviewsamples.R
import net.moisesborges.recyclerviewsamples.step1_implement_recyclerview.MainActivity
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.instanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class BasicRecyclerViewTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun step0_launchTheApp_without_errors() {

    }


//    @Test
//    fun step1_addRecyclerViewDependency_andCreateTheRecyclerViewOnXmlLayout() {
//        onView(withId(R.id.tasksRecyclerView))
//                .check(matches(instanceOf(RecyclerView::class.java)))
//    }
//
//    @Test
//    fun step2_createAndAttachAdapter_itShouldDisplayTheItems() {
//        val app = activityRule.activity.applicationContext as App
//        app.createTasks().forEachIndexed { task, index ->
//            onView(withId(R.id.tasksRecyclerView))
//                    .perform(RecyclerViewActions.scrollToPosition<TaskViewHolder>(index))
//
//            onView(withText(task.description))
//                    .check(matches(isDisplayed()))
//
//            onView(allOf(hasSibling(withText(task.description)), instanceOf(CheckBox::class.java)))
//                    .check(matches(if (task.completed) isChecked() else isNotChecked()))
//        }
//    }
}
