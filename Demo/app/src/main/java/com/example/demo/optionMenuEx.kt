package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlin.system.exitProcess

class optionMenuEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu_ex)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId

       return when(id)
       {
           R.id.setting ->{
               Toast.makeText(applicationContext,"Settings Selected",Toast.LENGTH_SHORT).show()
               true
           }
           R.id.play ->{
               Toast.makeText(applicationContext,"Play Selected",Toast.LENGTH_SHORT).show()
               true
           }
           R.id.pause ->{
               Toast.makeText(applicationContext,"Pause Selected",Toast.LENGTH_SHORT).show()
               true
           }
           R.id.exit ->{
            //   super.onBackPressed()
            //   exitProcess(0)
               finish()
               true
           }
           else ->super.onOptionsItemSelected(item)
       }
    }
}