package com.example.demo

import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class ExplicitIntentDataTransfer1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_data_transfer1)

        val getResultButton = findViewById<Button>(R.id.getResultButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        val secondActivityWithResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        {
                result: ActivityResult? ->
            if(result?.resultCode== RESULT_OK)
            {
                resultTextView.text = result.data?.getStringExtra("result")
            }
            else
                if(result?.resultCode== RESULT_CANCELED)
                {
                    Toast.makeText(applicationContext, "Back Button Pressed", Toast.LENGTH_LONG).show()
                }

        }

        getResultButton.setOnClickListener {
            val intent = Intent(this,ExplicitIntetntDatatransfer2::class.java)
            secondActivityWithResult.launch(intent)
        }
    }
}