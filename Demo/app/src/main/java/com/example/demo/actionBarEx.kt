package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast

class actionBarEx : AppCompatActivity() {
    lateinit var count:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_ex)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.actionbar_menu,menu)
        val item=menu.findItem(R.id.app_bar_search)
        val searchView=item.actionView as SearchView
        searchView.queryHint="Search people"

        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(applicationContext,query,Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onQueryTextChange(query: String?): Boolean {
                Toast.makeText(applicationContext,query,Toast.LENGTH_SHORT).show()
                return true
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add ->{
                count=findViewById(R.id.info)
                count.setText("Add is Clicked")
            }
            R.id.reset ->{
                count=findViewById(R.id.info)
                count.setText("Nothing is selected")
            }
            R.id.about ->{
               Toast.makeText(applicationContext,"About Clicked",Toast.LENGTH_SHORT).show()
            }
            R.id.exit ->{
                finish()
            }
        }
        return true
    }
}