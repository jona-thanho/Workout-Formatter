package com.example.workoutformatter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pullUpInput = findViewById<EditText>(R.id.etNumPullUp)
        val resultField = findViewById<EditText>(R.id.etResult)
        var resultFieldText = resultField.text
        val numPullUps = pullUpInput.text.toString()

        var result = "$numPullUps pull-ups (/5)"
        resultFieldText = result
    }
}