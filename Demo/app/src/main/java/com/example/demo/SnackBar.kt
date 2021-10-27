package com.example.demo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        val snack = findViewById<Button>(R.id.btnSnack)
        snack.setOnClickListener {
            val snackBar = Snackbar.make(it,"Thanks for Visiting", Snackbar.LENGTH_LONG)
                .setAction("Action"){
                    Toast.makeText(this,"SnackBar!",Toast.LENGTH_LONG).show()
                }
            snackBar.setActionTextColor(Color.RED)
            snackBar.setTextColor(Color.BLUE)
            snackBar.setBackgroundTint(Color.CYAN)
            snackBar.show()
        }
    }
}