package com.example.workoutformatter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val setOneNumPushUps = intent.getStringExtra("SET_ONE_NUM_PULL_UPS")
        val setOneNumDmdPushUps = intent.getStringExtra("SET_ONE_NUM_DMD_PUSH_UPS")
        val setOneNumChinUps = intent.getStringExtra("SET_ONE_NUM_CHIN_UPS")
        val setOneNumStdPushUps = intent.getStringExtra("SET_ONE_NUM_STD_PUSH_UPS")

        val pullUpInput = findViewById<EditText>(R.id.etSetTwoNumPullUp)
        val dmdPushUpInput = findViewById<EditText>(R.id.etSetTwoNumDmdPushUp)
        val chinUpInput = findViewById<EditText>(R.id.etSetTwoNumChinUp)
        val stdPushUpInput = findViewById<EditText>(R.id.etSetTwoNumStdPushUp)

        val nextButton = findViewById<Button>(R.id.btnNextScndAct)

        val intentThirdActivity = Intent(this, ThirdActivity::class.java)

        intentThirdActivity.putExtra("SET_ONE_NUM_PULL_UPS", setOneNumPushUps)
        intentThirdActivity.putExtra("SET_ONE_NUM_DMD_PUSH_UPS", setOneNumDmdPushUps)
        intentThirdActivity.putExtra("SET_ONE_NUM_CHIN_UPS", setOneNumChinUps)
        intentThirdActivity.putExtra("SET_ONE_NUM_STD_PUSH_UPS", setOneNumStdPushUps)

        nextButton.setOnClickListener {
            val numPullUps = pullUpInput.text.toString()
            intentThirdActivity.putExtra("SET_TWO_NUM_PULL_UPS", numPullUps)

            val numDmdPushUps = dmdPushUpInput.text.toString()
            intentThirdActivity.putExtra("SET_TWO_NUM_DMD_PUSH_UPS", numDmdPushUps)

            val numChinUps = chinUpInput.text.toString()
            intentThirdActivity.putExtra("SET_TWO_NUM_CHIN_UPS", numChinUps)

            val numStdPushUps = stdPushUpInput.text.toString()
            intentThirdActivity.putExtra("SET_TWO_NUM_STD_PUSH_UPS", numStdPushUps)

            startActivity(intentThirdActivity)
        }
    }
}