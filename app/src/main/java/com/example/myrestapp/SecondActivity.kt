package com.example.myrestapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btnSearchSongs).setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        findViewById<Button>(R.id.btnStreaming).setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }

        findViewById<Button>(R.id.btnArchive).setOnClickListener {
            startActivity(Intent(this, FifthActivity::class.java))
        }
    }
}

