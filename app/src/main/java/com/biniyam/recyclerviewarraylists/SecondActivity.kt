package com.biniyam.recyclerviewarraylists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var btn_close: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView)
        val numberList = intent.getSerializableExtra("key")
        textView.text = numberList.toString()

        findViewById<Button?>(R.id.btn_close).setOnClickListener { finish() }


    }
}