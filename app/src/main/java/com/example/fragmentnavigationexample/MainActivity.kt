package com.example.fragmentnavigationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var buttn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textView2)
        buttn = findViewById(R.id.button2)

        text.text = "Hello!"
        buttn.setOnClickListener {
            println("KLIK")
            text.text = if (text.text == "Hello!") "Goodbye" else "Hello!"
        }
    }
}