package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class DynamicViewEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_view_ex)

        val ll=findViewById<LinearLayout>(R.id.linear_layout)
        val b1=findViewById<Button>(R.id.b1)

        b1.setOnClickListener {
            var b2=Button(this)
            b2.text="New Button"
            b2.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            var pf=TextView(this)
            pf.text="New Button Created"
            pf.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            b2.setOnClickListener {
                Toast.makeText(this,"New DynamicButton",Toast.LENGTH_SHORT).show()
            }

            ll.addView(b2)
            ll.addView(pf)
        }
    }
}