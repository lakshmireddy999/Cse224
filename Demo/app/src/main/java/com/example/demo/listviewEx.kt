package com.example.demo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast

class listviewEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview_ex)

        val lv=findViewById<ListView>(R.id.lv1)
        val ll=findViewById<LinearLayout>(R.id.ll)
      /*  val b= arrayOf("Apple","Banana","Mango","Grapes")
        val ab=ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        lv.adapter=ab
        lv.setOnItemClickListener{adapterView, view, position, id ->
            val str=adapterView.getItemAtPosition(position)as String
            Toast.makeText(this,"You Clicked ${str}",Toast.LENGTH_SHORT).show()

        }*/

        val a= arrayOf(Color.RED,Color.GREEN,Color.BLUE,Color.WHITE)
        val b= arrayOf("RED","GREEN","BLUE","WHITE")
        val ab=ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        lv.adapter=ab
        lv.setOnItemClickListener { parent, view, position, id ->
            ll.setBackgroundColor(a[position])
        }
    }
}