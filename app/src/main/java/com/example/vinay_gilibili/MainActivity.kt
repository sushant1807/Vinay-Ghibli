package com.example.vinay_gilibili

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.epita.fr.androidabdulghibli.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        films_button.setOnClickListener {
        val i = Intent(this@MainActivity, ListActivity::class.java)
        startActivity(i)
     }

    }
}
