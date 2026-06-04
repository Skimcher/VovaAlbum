package com.vovaalbum

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Poem2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poem)

        findViewById<TextView>(R.id.tvPoem).text = getString(R.string.poem2)

        // Финальный экран — кнопка "Далее" скрыта
        findViewById<Button>(R.id.btnNext).visibility = android.view.View.GONE
        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }
    }
}
