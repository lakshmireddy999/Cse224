package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        var text=findViewById<TextView>(R.id.textView)
        var fade_in=findViewById<Button>(R.id.fade_in)
        var fade_out=findViewById<Button>(R.id.fade_out)
        var slide_in=findViewById<Button>(R.id.slide_in)
        var slide_out=findViewById<Button>(R.id.slide_out)
        var zoom_in=findViewById<Button>(R.id.zoom_in)
        var zoom_out=findViewById<Button>(R.id.zoom_out)
        var rotate=findViewById<Button>(R.id.rotate)
        var bounce=findViewById<Button>(R.id.bounce)

        fade_in.setOnClickListener {
            text.visibility=View.VISIBLE
            val fadeIn=AnimationUtils.loadAnimation(this,R.anim.fade_in)
            text.startAnimation(fadeIn)
        }
        fade_out.setOnClickListener {
            val fadeOut=AnimationUtils.loadAnimation(this,R.anim.fade_out)
            text.startAnimation(fadeOut)
        }
        zoom_in.setOnClickListener {
            val zoomIn=AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            text.startAnimation(zoomIn)
        }
        zoom_out.setOnClickListener {
            val zoomOut=AnimationUtils.loadAnimation(this,R.anim.zoom_out)
            text.startAnimation(zoomOut)
        }
        slide_in.setOnClickListener {
            val slideIn=AnimationUtils.loadAnimation(this,R.anim.slide_in)
            text.startAnimation(slideIn)
        }
        slide_out.setOnClickListener {
            val slideOut=AnimationUtils.loadAnimation(this,R.anim.slide_out)
            text.startAnimation(slideOut)
        }
        bounce.setOnClickListener {
            val bounce=AnimationUtils.loadAnimation(this,R.anim.bounce)
            text.startAnimation(bounce)
        }
        rotate.setOnClickListener {
            val rotate=AnimationUtils.loadAnimation(this,R.anim.rotate)
            text.startAnimation(rotate)
        }



    }
}