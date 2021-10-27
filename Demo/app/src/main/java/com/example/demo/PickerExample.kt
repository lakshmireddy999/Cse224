package com.example.demo

import android.app.Instrumentation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class PickerExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picker_example)

        val imgv=findViewById<ImageView>(R.id.imageV)
        val btnp=findViewById<Button>(R.id.btnp)

        val getI=registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                imgv.setImageURI(it)
            }
        )
        btnp.setOnClickListener {
            getI.launch("image/*")
        }
    }
}