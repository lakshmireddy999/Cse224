package com.example.demo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts

class ImageTransfer1 : AppCompatActivity() {
    lateinit var imageuri: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_transfer1)

        val imgv=findViewById<ImageView>(R.id.img)
        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)

        val getI=registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                imageuri=it
                imgv.setImageURI(it)
            }
        )
        btn1.setOnClickListener {
            getI.launch("image/*")
        }
        btn2.setOnClickListener {
            val intent=Intent(this,ImageTransfer2::class.java)
            intent.putExtra("img",imageuri)
            startActivity(intent)
        }
    }
}