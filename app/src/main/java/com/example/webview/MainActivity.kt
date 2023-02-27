package com.example.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webView:WebView?= null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="myapp"
        val webView =findViewById<WebView>(R.id.webb)
        webView.webViewClient=WebViewClient()
        //web view client is the object responsible for the most of the actions inside
        val webSettings=webView.settings
        webSettings.javaScriptEnabled
        webView.loadUrl("https://kyu.ac.ug/m")
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){
            webView.goBack()
            //can go back to
            // this method specifies the web-view has a back history item
        }else{

        super.onBackPressed()
    }
    }
}