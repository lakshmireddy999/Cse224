package com.example.demo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Appchooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appchooser)

        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener {
            val location= Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California")
            val mapIntent=Intent(Intent.ACTION_VIEW,location)
            startActivity(mapIntent)
        }

        btn2.setOnClickListener {
            var url="https://www.google.com"
            val intetnt=Intent(Intent.ACTION_VIEW)
            intetnt.setDataAndType(Uri.parse(url),"text/plain")
            val choose=Intent.createChooser(intetnt,"Share Url")
            startActivity(choose)
        }


    }
}