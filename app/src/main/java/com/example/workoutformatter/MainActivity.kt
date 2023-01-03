package com.example.workoutformatter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pullUpInput = findViewById<EditText>(R.id.etNumPullUp)
        val resultField = findViewById<EditText>(R.id.etResult)
        val numPullUps = pullUpInput.text.toString()
        val result = "$numPullUps pull-ups (/5)"

        val intent = Intent(this, SecondActivity::class.java)
        resultField.setText(result)
    }
}