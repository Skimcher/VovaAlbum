package com.vovaalbum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Photo1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        findViewById<ImageView>(R.id.imgPhoto).setImageResource(R.drawable.photo1)

        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }
        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, Poem1Activity::class.java))
        }
    }
}
