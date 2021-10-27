package com.example.demo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)


        val cam=findViewById<Button>(R.id.camera)
        val call=findViewById<Button>(R.id.call_logs)
        val brow=findViewById<Button>(R.id.browser)
        val gall=findViewById<Button>(R.id.gallery)
        val contact=findViewById<Button>(R.id.contacts)

        cam.setOnClickListener {
            val camera_intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camera_intent)
        }
        call.setOnClickListener {
            val intentCallLog = Intent(Intent.ACTION_VIEW)
            intentCallLog.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(intentCallLog)
        }
        brow.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
        gall.setOnClickListener {
            val intent=Intent()
            intent.action=Intent.ACTION_VIEW
            intent.type="image/*"
            intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
        contact.setOnClickListener {
            val conIntent=Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(conIntent)
        }
    }
}