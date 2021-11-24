package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class Permission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        val btn=findViewById<Button>(R.id.btn)

        val requestCamera=registerForActivityResult(ActivityResultContracts.RequestPermission())
        {
            if(it)
            {
                Toast.makeText(applicationContext,"Permission granted", Toast.LENGTH_SHORT).show()
                setActivityResult()
                finish()
            }
            else
            {
                Toast.makeText(applicationContext,"Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
        btn.setOnClickListener {
            requestCamera.launch(android.Manifest.permission.CAMERA)
        }
    }

    private fun setActivityResult() {
        val cameraintent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(cameraintent)
    }
}