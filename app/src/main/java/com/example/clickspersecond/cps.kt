package com.example.clickspersecond

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class cps: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cps)
        val bclick = findViewById<Button>(R.id.buttoncps)
        val tv = findViewById<TextView>(R.id.textView3)
        val c=0
        bclick.setOnClickListener {
            //Increase the counter everytime the button is clicked
            Handler().postDelayed(
                Runnable { bclick.setEnabled(false) }, 5000 //Specific time in milliseconds
            )
        }
        tv.text=c//add the recorde value to the text view in string type
    }
}