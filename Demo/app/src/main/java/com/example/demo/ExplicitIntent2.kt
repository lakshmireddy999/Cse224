package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ExplicitIntent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent2)

        val btn2=findViewById<Button>(R.id.btn2)
        val bundle:Bundle?=intent.extras
        val id=bundle?.get("Id_Value")
        val msg=bundle?.get("Msg_Value")
        Toast.makeText(applicationContext,id.toString()+" "+msg,Toast.LENGTH_SHORT).show()

        btn2.setOnClickListener {
            val intent=Intent(this,ExplicitIntent1::class.java)
            startActivity(intent)
        }

    }
}