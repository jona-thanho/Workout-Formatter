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

        val pullUpInput = findViewById<EditText>(R.id.etNumPullUp)
        val formatButton = findViewById<Button>(R.id.btnFormat)
        val intent = Intent(this, WorkingSecondActivity::class.java)

        formatButton.setOnClickListener {
            val numPullUps = pullUpInput.text.toString()
            intent.putExtra("NUM_PULL_UPS", numPullUps)
            startActivity(intent)
        }
    }
}