package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class sp : AppCompatActivity() {
    private val SPLASH_TIME_OUT=5555L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sp)
        Handler().postDelayed({
            val rate=Intent(this,signin::class.java)
            startActivity(rate)
        },SPLASH_TIME_OUT)

    }
}