package com.sj.cameratesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.sj.mylibrary.CameraActivity
import com.sj.mylibrary.DemoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)


        button.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)

        }

        button2.setOnClickListener {
            val intent = Intent(this, DemoActivity()::class.java)
            intent.putExtra("msg","Opened Demo")
            startActivity(intent)

        }


    }


}