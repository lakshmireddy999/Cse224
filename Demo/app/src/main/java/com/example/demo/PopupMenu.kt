package com.example.demo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu

class PopupMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu)
        val btn=findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
           val popup=PopupMenu(this,btn)
            popup.menuInflater.inflate(R.menu.popupmenu,popup.menu)

            popup.setOnMenuItemClickListener {
                Toast.makeText(applicationContext,"You Clicked: "+it.title,Toast.LENGTH_LONG).show()
                true
                if(it.title.toString()=="Search")
                {
                    val intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
                    startActivity(intent)
                }
                true
            }
            popup.show()
        }
    }
}