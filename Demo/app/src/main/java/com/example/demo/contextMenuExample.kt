package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class contextMenuExample : AppCompatActivity() {

    var listView:ListView?=null
    var adapter:ArrayAdapter<String>?=null
    var contacts= arrayOf("Akash","Sachin","Ajay","Lakshmi","Yogesh")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu_example)

        listView = findViewById<ListView>(R.id.listView)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts)
        listView?.adapter = adapter

        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater=menuInflater
        inflater.inflate(R.menu.context_menu,menu)
        menu.setHeaderTitle("Select Action")
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {

        if(item.itemId==R.id.call) {

            Toast.makeText(this, "Calling ", Toast.LENGTH_SHORT).show()
        }
        else if(item.itemId==R.id.sms)
            Toast.makeText(this,"Sending sms", Toast.LENGTH_SHORT).show()
        else
            return true
        return true
    }

}