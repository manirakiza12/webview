package com.example.webview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reg : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        val y=findViewById<Button>(R.id.button3)
        y.setOnClickListener {
            val d=Intent(this,MainActivity::class.java)
            startActivity(d)
        }
    }
}