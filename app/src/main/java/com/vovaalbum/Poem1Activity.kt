package com.vovaalbum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Poem1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poem)

        findViewById<TextView>(R.id.tvPoem).text = getString(R.string.poem1)

        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, Photo2Activity::class.java))
        }
    }
}
