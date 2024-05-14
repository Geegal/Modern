package com.example.moderntravel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Booking = findViewById<Button>(R.id.btnbookride)
        Booking.setOnClickListener {
            val x = Intent(applicationContext, MainActivity::class.java)
            startActivity(x)
        }
        val btnbooking_summary = findViewById<Button>(R.id.btnbooking_summary)
        btnbooking_summary.setOnClickListener {
            val x = Intent(applicationContext, booking_summary::class.java)
            startActivity(x)
        }
    }
}