package com.example.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.accessibility.AccessibilityManager
import android.widget.*
import java.lang.StringBuilder

class Q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)

        val btn=findViewById<Button>(R.id.Btn)
        val Rgrp=findViewById<RadioGroup>(R.id.RGrp)
        val submit=findViewById<Button>(R.id.submit)
        val reset=findViewById<Button>(R.id.reset)
        val checkbox1=findViewById<CheckBox>(R.id.checkBox1)
        val checkbox2=findViewById<CheckBox>(R.id.checkBox2)
        val checkbox3=findViewById<CheckBox>(R.id.checkBox3)
        val select=findViewById<Button>(R.id.select)
        var radioButton:RadioButton

             btn.setOnClickListener {
            Toast.makeText(applicationContext,"Button Clicked",Toast.LENGTH_SHORT).show()
        }

        Rgrp.setOnCheckedChangeListener(
        RadioGroup.OnCheckedChangeListener{group,checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            Toast.makeText(applicationContext, "Selected : ${radio.text}", Toast.LENGTH_SHORT).show()
        }
        )
        submit.setOnClickListener {
            val selected:Int=Rgrp.checkedRadioButtonId
            radioButton=findViewById(selected)
            val output=radioButton.text.toString()
            Toast.makeText(applicationContext,output.toString(), Toast.LENGTH_SHORT).show()
        }
        reset.setOnClickListener {
            Rgrp.setOnCheckedChangeListener(null)
            Rgrp.clearCheck()

        }

        checkbox1.setOnClickListener {
            if(checkbox1.isChecked)
            Toast.makeText(applicationContext,"Android",Toast.LENGTH_SHORT).show()
        }
        checkbox2.setOnClickListener {
            if(checkbox2.isChecked)
            Toast.makeText(applicationContext,"Java",Toast.LENGTH_SHORT).show()
        }
        checkbox3.setOnClickListener {
            if(checkbox3.isChecked)
            Toast.makeText(applicationContext,"Kotlin",Toast.LENGTH_SHORT).show()
        }
        select.setOnClickListener {
            val str=StringBuilder()
            str.append("Selected Items")
            if(checkbox1.isChecked)
            {
                str.append("\nAndroid ")
            }
            if(checkbox2.isChecked)
            {
                str.append("\nJava ")
            }
            if(checkbox3.isChecked)
            {
                str.append("\nKotlin ")
            }
            if(!checkbox1.isChecked && !checkbox2.isChecked && !checkbox3.isChecked)
            {
                str.append("\nNone")
            }
            Toast.makeText(applicationContext,str.toString(),Toast.LENGTH_SHORT).show()

        }



    }
}