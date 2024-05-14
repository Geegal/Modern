package com.example.moderntravel

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONArray

class bookingsummary2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bookingsummary2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val progress = findViewById<ProgressBar>(R.id.progress)
        val api = "https://moderntravelsolution.pythonanywhere.com/passengers2"
        val helper = ApiHelper(applicationContext)
        helper.get(api, object : ApiHelper.CallBack {
            override fun onSuccess(result: String?) {
                val empJsonArray = JSONArray(result.toString())
                (0 until empJsonArray.length()).forEach{
                    val passenger = empJsonArray.getJSONObject(it)
                    val empdata = findViewById<TextView>(R.id.empdata2)
                    empdata.append("First Name   :"+passenger.get("first_name")+"\n")
                    empdata.append("Last Name   :"+passenger.get("last_name")+"\n")
                    empdata.append("Pick-Up Point   :"+passenger.get("pickup_point")+"\n")
                    empdata.append("Phone Number   :"+passenger.get("phone_number")+"\n")
                    empdata.append("Bus Number :"+passenger.get("bus_number")+"\n")

                    empdata.append("\n\n")
                }
                progress.visibility = View.GONE
            }

        })
    }
}