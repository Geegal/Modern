package com.example.moderntravel

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONObject

class kenyatta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kenyatta)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val first_name = findViewById<EditText>(R.id.wlfirst_name)
        val last_name = findViewById<EditText>(R.id.wllast_name)
        val pickup_point = findViewById<EditText>(R.id.wlpickup_point)
        val phone_number = findViewById<EditText>(R.id.wlphone_number)
        val bus_number = findViewById<EditText>(R.id.wlbus_number)

        val btnwlbook = findViewById<Button>(R.id.wlbook)
        btnwlbook.setOnClickListener {


            val body = JSONObject()
            body.put("first_name", first_name.text.toString())
            body.put("last_name" , last_name.text.toString())
            body.put("pickup_point" , pickup_point.text.toString())
            body.put("phone_number", phone_number.text.toString())
            body.put("bus_number", bus_number.text.toString())

            val api = "https://moderntravelsolution.pythonanywhere.com/passengers1"

            val helper = ApiHelper(applicationContext)
            helper.post(api, body)

        }
    }
}