package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog2)

        val btn=findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Login Alert")
                .setMessage("Are you sure, You want to Continue?")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){dialogInterface,which ->
                Toast.makeText(applicationContext,"Clicked Yes",Toast.LENGTH_SHORT).show()
                val builder2=AlertDialog.Builder(this)
                builder2.setTitle("Login Alert")
                    .setMessage("Are you sure, You want to Continue?")
                    .setCancelable(true)
                    .setIcon(android.R.drawable.ic_dialog_alert)

                builder2.setPositiveButton("Yes"){dialogInterface,which ->
                    Toast.makeText(applicationContext,"Clicked Yes",Toast.LENGTH_SHORT).show()
                }

                builder2.setNeutralButton("Cancel"){dialogInterface,which ->
                    Toast.makeText(applicationContext,"Clicked Cancel",Toast.LENGTH_SHORT).show()
                }
                builder2.setNegativeButton("No"){dialogInterface,which ->
                    Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_SHORT).show()
                }
                val alertDialog2:AlertDialog=builder2.create()
                alertDialog2.show()
            }
            builder.setNeutralButton("Cancel"){dialogInterface,which ->
                Toast.makeText(applicationContext,"Clicked Cancel",Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No"){dialogInterface,which ->
                Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_SHORT).show()
            }
            val alertDialog:AlertDialog=builder.create()
            alertDialog.show()
        }
    }
}