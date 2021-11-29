package com.example.demo

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.*
import kotlin.collections.ArrayList

class CustomAlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog)

        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)
        val btn3=findViewById<Button>(R.id.btn3)
        val btn4=findViewById<Button>(R.id.btn4)

        btn1.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Simple Alert")
                .setMessage("Simple Alert Dialog")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setCancelable(false)
                .setPositiveButton("Yes"){dialog,which ->
                    Toast.makeText(applicationContext,"Clicked Yes",Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("No"){dialog,which ->
                    Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_SHORT).show()
                }
                .show()
        }
        btn2.setOnClickListener {
            val items= arrayOf("Apple","Banana","Orange","Grapes")
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Alert with Items")
                .setCancelable(false)
                .setItems(items){dialog,which ->
                    Toast.makeText(applicationContext,items[which]+" Selected", Toast.LENGTH_SHORT).show()
                }
                .setPositiveButton("OK",null)
                .setNegativeButton("No", null)
                .setNeutralButton("Neutral",null)

            val alertDialog=builder.create()
            alertDialog.show()

            val btnp=alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
            val btnn=alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)

            btnp.setTextColor(Color.WHITE)
            btnn.setTextColor(Color.BLUE)

            btnn.setBackgroundColor(Color.RED)
            btnp.setBackgroundColor(Color.BLACK)

            btnp.setPadding(0,0,20,0,)
            btnn.setPadding(20,0,20,0)

        }

        btn3.setOnClickListener {
            val items= arrayOf("Apple","Banana","Orange","grapes")
            val selectedList=ArrayList<Int>()

            val builder=AlertDialog.Builder(this)
                .setTitle("This is MultiChoice")
                .setMultiChoiceItems(items,null){dialog,which,isChecked ->
                    if(isChecked)
                    {
                        selectedList.add(which)
                    }
                    else if(selectedList.contains(which))
                    {
                        selectedList.remove(which)
                    }
                }
                .setPositiveButton("Done"){dialog,i ->
                    val selectedString=ArrayList<String>()
                    for(j in selectedList.indices)
                        selectedString.add(items[selectedList[j]])

                    Toast.makeText(applicationContext,"Items selected are: "
                            +Arrays.toString(selectedString.toTypedArray()),Toast.LENGTH_SHORT).show()

                }
            builder.show()

        }

        btn4.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Button")
            val input=Button(this)
            input.text="Button"
            val lp=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)
            input.layoutParams=lp
            input.setOnClickListener {
                Toast.makeText(applicationContext,"Clicked Button",Toast.LENGTH_SHORT).show()
            }
            builder.setView(input)
            builder.setPositiveButton("Ok"){dialogInterface,i ->
                Toast.makeText(applicationContext,"Text entered is: "+input.text.toString(),Toast.LENGTH_SHORT).show()

            }
            builder.show()
        }

    }
}