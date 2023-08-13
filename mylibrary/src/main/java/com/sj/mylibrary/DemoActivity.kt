package com.sj.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DemoActivity : AppCompatActivity() {

    var message1:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        Log.d("CurrentFile","DemoActivity")
        val textTV = findViewById<TextView>(R.id.textView)

        if (intent.extras != null)
            message1 = intent.extras!!.getString("msg").toString()

        textTV.setOnClickListener {
            textTV.text = message1
        }
    }
}