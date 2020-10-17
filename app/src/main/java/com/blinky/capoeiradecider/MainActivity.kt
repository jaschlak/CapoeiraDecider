package com.blinky.capoeiradecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val workoutList = arrayListOf("Straight Kicks", "Round Kicks", "Esquivas", "Movements", "Partner Drills")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chooseWorkoutButton.setOnClickListener{
            val random = Random()
            val workoutIndex = random.nextInt(workoutList.count())
            selectedTrainText.text = workoutList[workoutIndex]
        }

        addWorkoutButton.setOnClickListener {
            val newWorkout = addWorkoutText.text.toString()
            workoutList.add(newWorkout)
            addWorkoutText.text.clear()
            Toast.makeText(this, "$newWorkout has been added", Toast.LENGTH_SHORT).show()
        }

    }




}