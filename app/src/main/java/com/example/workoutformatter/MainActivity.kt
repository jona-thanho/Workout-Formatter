package com.example.workoutformatter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pullUpInput = findViewById<EditText>(R.id.etSetOneNumPullUp)
        val dmdPushUpInput = findViewById<EditText>(R.id.etSetOneNumDmdPushUp)
        val chinUpInput = findViewById<EditText>(R.id.etSetOneNumChinUp)
        val stdPushUpInput = findViewById<EditText>(R.id.etSetOneNumStdPushUp)

        val nextButton = findViewById<Button>(R.id.btnNextMainAct)

        val intentSecondActivity = Intent(this, SecondActivity::class.java)

        nextButton.setOnClickListener {
            val numPullUps = pullUpInput.text.toString()
            intentSecondActivity.putExtra("SET_ONE_NUM_PULL_UPS", numPullUps)

            val numDmdPushUps = dmdPushUpInput.text.toString()
            intentSecondActivity.putExtra("SET_ONE_NUM_DMD_PUSH_UPS", numDmdPushUps)

            val numChinUps = chinUpInput.text.toString()
            intentSecondActivity.putExtra("SET_ONE_NUM_CHIN_UPS", numChinUps)

            val numStdPushUps = stdPushUpInput.text.toString()
            intentSecondActivity.putExtra("SET_ONE_NUM_STD_PUSH_UPS", numStdPushUps)

            startActivity(intentSecondActivity)
        }
    }
}