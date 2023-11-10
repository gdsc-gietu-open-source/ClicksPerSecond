package com.example.clickspersecond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bclick =findViewById<Button>(R.id.button1)
        bclick.setOnClickListener {
            val intent =Intent(this,cps::class.java)
            startActivity(intent)
        }
    }
}