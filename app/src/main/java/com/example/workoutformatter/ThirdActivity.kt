package com.example.workoutformatter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val pullUpResults =
            "Pull-Ups (${intent.getStringExtra("SET_ONE_NUM_PULL_UPS")} | " +
                    "${intent.getStringExtra("SET_TWO_NUM_PULL_UPS")}):"
        val dmdPushUpResults =
            "Diamond Push-Ups (${intent.getStringExtra("SET_ONE_NUM_DMD_PUSH_UPS")} | " +
                "${intent.getStringExtra("SET_TWO_NUM_DMD_PUSH_UPS")}):"
        val chinUpResults =
            "Chin-Ups (${intent.getStringExtra("SET_ONE_NUM_CHIN_UPS")} | " +
                "${intent.getStringExtra("SET_TWO_NUM_CHIN_UPS")}):"
        val stdPushUpResults =
            "Standard Push-Ups (${intent.getStringExtra("SET_ONE_NUM_STD_PUSH_UPS")} | " +
                "${intent.getStringExtra("SET_TWO_NUM_STD_PUSH_UPS")}):"

        val pullUpText = findViewById<TextView>(R.id.tvRatePullUp)
        val pullUpInput = findViewById<EditText>(R.id.etRatePullUp)

        val dmdPushUpText = findViewById<TextView>(R.id.tvRateDmdPushUp)
        val dmdPushUpInput = findViewById<EditText>(R.id.etRateDmdPushUp)

        val chinUpText = findViewById<TextView>(R.id.tvRateChinUp)
        val chinUpInput = findViewById<EditText>(R.id.etRateChinUp)

        val stdPushUpText = findViewById<TextView>(R.id.tvRateStdPushUp)
        val stdPushUpInput = findViewById<EditText>(R.id.etRateStdPushUp)

        val nextButton = findViewById<Button>(R.id.btnNextThdAct)

        val intentFourthActivity = Intent(this, FourthActivity::class.java)

        pullUpText.setText(pullUpResults)
        dmdPushUpText.setText(dmdPushUpResults)
        chinUpText.setText(chinUpResults)
        stdPushUpText.setText(stdPushUpResults)

         // TODO: accent user input from previous activities
//        for (n in pullUpText.text.toString()) {
//            if (n.t)
//        }

        intentFourthActivity.putExtra("PULL_UP_RESULTS",
            "${intent.getStringExtra("SET_ONE_NUM_PULL_UPS")} | " +
                    "${intent.getStringExtra("SET_TWO_NUM_PULL_UPS")}")
        intentFourthActivity.putExtra("DMD_PUSH_UP_RESULTS",
            "${intent.getStringExtra("SET_ONE_NUM_DMD_PUSH_UPS")} | " +
                    "${intent.getStringExtra("SET_TWO_NUM_DMD_PUSH_UPS")}")
        intentFourthActivity.putExtra("CHIN_UP_RESULTS",
            "${intent.getStringExtra("SET_ONE_NUM_CHIN_UPS")} | " +
                    "${intent.getStringExtra("SET_TWO_NUM_CHIN_UPS")}")
        intentFourthActivity.putExtra("STD_PUSH_UP_RESULTS",
            "${intent.getStringExtra("SET_ONE_NUM_STD_PUSH_UPS")} | " +
                    "${intent.getStringExtra("SET_TWO_NUM_STD_PUSH_UPS")}")

        nextButton.setOnClickListener {
            val pullUpRating = pullUpInput.text.toString()
            intentFourthActivity.putExtra("RATING_PULL_UPS", pullUpRating)

            val dmdPushUpRating = dmdPushUpInput.text.toString()
            intentFourthActivity.putExtra("RATING_DMD_PUSH_UPS", dmdPushUpRating)

            val chinUpRating = chinUpInput.text.toString()
            intentFourthActivity.putExtra("RATING_CHIN_UPS", chinUpRating)

            val stdPushUpRating = stdPushUpInput.text.toString()
            intentFourthActivity.putExtra("RATING_STD_PUSH_UPS", stdPushUpRating)

            startActivity(intentFourthActivity)
        }
    }
}