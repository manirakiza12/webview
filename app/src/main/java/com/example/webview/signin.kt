package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        val va=findViewById<Button>(R.id.button)
        va.setOnClickListener {
            val te=Intent(this,MainActivity::class.java)
            startActivity(te)
        }
        val p=findViewById<Button>(R.id.button2)
        p.setOnClickListener {
            val amos=Intent(this,reg::class.java)
            startActivity(amos)
        }
    }
}