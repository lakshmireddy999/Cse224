package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_form)

        val name=findViewById<TextView>(R.id.Name)
        val RegNo=findViewById<TextView>(R.id.RegNo)
        val Phno=findViewById<TextView>(R.id.Phno)
        val btn=findViewById<Button>(R.id.btnSubmit)
        val out=findViewById<TextView>(R.id.out)

        btn.setOnClickListener {
            if(name.text.toString().isEmpty() || RegNo.text.toString().isEmpty() || Phno.text.toString().isEmpty())
            {
                Toast.makeText(applicationContext,"Fill all information", Toast.LENGTH_SHORT).show()
                out.text="Fil all information"
            }
            else {
                out.text = """
                Name=${name.text}
                RegNo=${RegNo.text}
                Phno=${Phno.text}
            """.trimIndent()
            }
        }
    }
}