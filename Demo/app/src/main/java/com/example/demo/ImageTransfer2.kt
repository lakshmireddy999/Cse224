package com.example.demo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageTransfer2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_transfer2)

        val imageS=findViewById<ImageView>(R.id.imgS)
        val bundle:Bundle?=intent.extras
        val id=bundle?.get("img")
        imageS.setImageURI(id as Uri)
    }
}