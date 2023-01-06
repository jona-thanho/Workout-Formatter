package com.example.workoutformatter

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val finalNumPullUps = intent.getStringExtra("PULL_UP_RESULTS")
        val finalRatingPullUps = intent.getStringExtra("RATING_PULL_UPS")

        val finalNumDmdPushUps = intent.getStringExtra("DMD_PUSH_UP_RESULTS")
        val finalRatingDmdPushUps = intent.getStringExtra("RATING_DMD_PUSH_UPS")

        val finalNumChinUps = intent.getStringExtra("CHIN_UP_RESULTS")
        val finalRatingChinUps = intent.getStringExtra("RATING_CHIN_UPS")

        val finalNumStdPushUps = intent.getStringExtra("STD_PUSH_UP_RESULTS")
        val finalRatingStdPushUps = intent.getStringExtra("RATING_STD_PUSH_UPS")

        val resultField = findViewById<EditText>(R.id.etResult)

        val intentMainActivity = Intent(this, MainActivity::class.java)

        // display input into desired format
        val result = "$finalNumPullUps pull-ups ($finalRatingPullUps/5)\n" +
                "$finalNumDmdPushUps diamond push-ups ($finalRatingDmdPushUps/5)\n" +
                "$finalNumChinUps chin-ups ($finalRatingChinUps/5)\n" +
                "$finalNumStdPushUps standard push-ups ($finalRatingStdPushUps/5)"
        resultField.setText(result)

        // create button for easy copying
        val copyButton = findViewById<Button>(R.id.btnCopy)
        val resultFieldText = resultField.text.toString()
        copyButton.setOnClickListener {
            val clipboard =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText(resultFieldText, resultFieldText) as ClipData
            clipboard.setPrimaryClip(clip)
        }

        // create button to restart app
        val restartButton = findViewById<Button>(R.id.btnRestart)
        restartButton.setOnClickListener {
            startActivity(intentMainActivity)
        }
    }
}