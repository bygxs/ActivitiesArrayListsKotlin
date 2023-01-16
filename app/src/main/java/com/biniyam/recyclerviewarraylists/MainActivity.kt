package com.biniyam.recyclerviewarraylists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    var number: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "my First Kotlin"
        button = findViewById(R.id.button)
        button.setOnClickListener {
            number.add("one")
            number.add("two")
            number.add("three")
            number.add("four")
            number.add("five")
            number.add("six")
            number.add("seven")
            number.add("eight")
            number.add("one one")

            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("key",number)
            startActivity(intent)
        }


    }
}