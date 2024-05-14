package com.example.moderntravel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnwestlands = findViewById<Button>(R.id.btnwestlands)
        btnwestlands.setOnClickListener{
            val x = Intent(applicationContext, westlands::class.java)
            startActivity(x)
        }
        val btnupperhill = findViewById<Button>(R.id.btnupperhill)
        btnupperhill.setOnClickListener{
            val x = Intent(applicationContext, upperhill::class.java)
            startActivity(x)
        }
        val btnkenyatta = findViewById<Button>(R.id.btnkenyatta)
        btnkenyatta.setOnClickListener{
            val x = Intent(applicationContext, kenyatta::class.java)
            startActivity(x)
        }
        val btnkitengela = findViewById<Button>(R.id.btnkitengela)
        btnkitengela.setOnClickListener{
            val x = Intent(applicationContext, kitengela::class.java)
            startActivity(x)
        }
        val btnthika = findViewById<Button>(R.id.btnthika)
        btnthika.setOnClickListener{
            val x = Intent(applicationContext, thika::class.java)
            startActivity(x)
        }
        val btnmalaa = findViewById<Button>(R.id.btnmalaa)
        btnmalaa.setOnClickListener{
            val x = Intent(applicationContext, malaa::class.java)
            startActivity(x)
        }
    }
}