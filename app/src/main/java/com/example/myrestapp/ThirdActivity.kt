package com.example.myrestapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textView = findViewById<TextView>(R.id.songsTextView)

        val canzoni = listOf(
            "Bohemian Rhapsody – Queen",
            "Imagine – John Lennon",
            "Smells Like Teen Spirit – Nirvana",
            "Billie Jean – Michael Jackson",
            "Hey Jude – The Beatles",
            "Shake It Off – Taylor Swift",
            "Blinding Lights – The Weeknd"
        )

        textView.text = canzoni.joinToString("\n\n")
    }
}


