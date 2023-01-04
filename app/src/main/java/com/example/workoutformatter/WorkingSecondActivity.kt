package com.example.workoutformatter

import android.R.attr.label
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class WorkingSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_working)
        // display input into copyable format
        val resultField = findViewById<EditText>(R.id.etResult)
        val numPullUps = intent.getStringExtra("NUM_PULL_UPS")
        val result = "$numPullUps pull-ups (/5)\n" +
                "7, 6 diamond push-up (4/5)\n" +
                "5, 4 chin up (2/5)\n" +
                "21, 8 standard push-up (2/5)"

        resultField.setText(result)

        // create button for instant copying
        val copyButton = findViewById<Button>(R.id.btnCopy)
        copyButton.setOnClickListener {
            val clipboard =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText(label, text) as ClipData
            clipboard.setPrimaryClip(clip)
        }
    }
}