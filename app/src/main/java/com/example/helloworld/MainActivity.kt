package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val myTextView = findViewById<TextView>(R.id.textView1)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            Toast.makeText( this, "A new person has clicked the button!", Toast.LENGTH_LONG).show()
        }

    }
}