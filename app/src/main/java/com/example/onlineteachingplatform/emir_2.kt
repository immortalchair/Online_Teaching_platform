package com.example.onlineteachingplatform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class emir_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emir2)
        val btn = findViewById<TextView>(R.id.Sen1)

        btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}