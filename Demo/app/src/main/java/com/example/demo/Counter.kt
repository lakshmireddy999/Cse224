package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Counter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val plus=findViewById<Button>(R.id.plus)
        val sub=findViewById<Button>(R.id.sub)
        val num=findViewById<TextView>(R.id.num)
        var n:Float
        plus.setOnClickListener {
            n=num.text.toString().toFloat()
            n+=1;
            num.text=n.toString()
        }

        sub.setOnClickListener {
            n=num.text.toString().toFloat()
            n-=1
            num.text=n.toString()
        }
    }
}