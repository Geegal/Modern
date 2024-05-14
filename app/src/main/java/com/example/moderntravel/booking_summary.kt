package com.example.moderntravel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class booking_summary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_booking_summary)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val summary1 = findViewById<Button>(R.id.summary1)
        summary1.setOnClickListener{
            val x = Intent(applicationContext, bookingsummary1::class.java)
            startActivity(x)
        }
        val summary2 = findViewById<Button>(R.id.summary2)
        summary2.setOnClickListener{
            val x = Intent(applicationContext, bookingsummary2::class.java)
            startActivity(x)
        }
    }
}