package com.jdd.taxoview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
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
        val Bacteria2 = findViewById<ImageButton>(R.id.Bacteria)
        val Archaea2 = findViewById<ImageButton>(R.id.Archaea)
        val Eukarya2 = findViewById<ImageButton>(R.id.Eukarya)
        Eukarya2.setOnClickListener{
            val intent  = Intent(this, Eukarya::class.java)
            startActivity(intent)
        }
        Archaea2.setOnClickListener{
            val intent  = Intent(this, Archaea::class.java)
            startActivity(intent)
        }
        Bacteria2.setOnClickListener{
            val intent  = Intent(this, Bacteria::class.java)
            startActivity(intent)
        }
    }
}