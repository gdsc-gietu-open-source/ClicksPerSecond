package com.example.clickspersecond

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class cps: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cps)
        val bclick = findViewById<Button>(R.id.buttoncps)
        val tv = findViewById<TextView>(R.id.textView3)
        var c=0
        bclick.setOnClickListener {
            c++
            tv.text = c.toString() +" Clicks"

            Handler().postDelayed(
                Runnable {
                    bclick.isEnabled = false
                },
                1000
            )
        }

    }
}