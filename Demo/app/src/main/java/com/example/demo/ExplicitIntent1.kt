package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExplicitIntent1 : AppCompatActivity() {
    val id:Int=10
    val msg:String="Kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent1)

        var btn1=findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener {
            val intent= Intent(this,ExplicitIntent2::class.java)
            intent.putExtra("Id_Value",id)
            intent.putExtra("Msg_Value",msg)
            startActivity(intent)
        }
    }
}