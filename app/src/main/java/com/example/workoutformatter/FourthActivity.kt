package com.example.workoutformatter

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        // display input into copyable format
        val resultField = findViewById<EditText>(R.id.etResult)
        val numPullUps = intent.getStringExtra("NUM_PULL_UPS")
        val numDmdPushUps = intent.getStringExtra("NUM_DMD_PUSH_UPS")

        val result = "$numPullUps pull-ups (/5)\n" +
                "$numDmdPushUps diamond push-up (4/5)\n" +
                "??? chin up (2/5)\n" +
                "??? standard push-up (2/5)"
        resultField.setText(result)

        // create button for instant copying

        val copyButton = findViewById<Button>(R.id.btnCopy)
        val resultFieldText = resultField.text.toString()
        copyButton.setOnClickListener {
            val clipboard =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText(resultFieldText, resultFieldText) as ClipData
            clipboard.setPrimaryClip(clip)
        }
    }
}