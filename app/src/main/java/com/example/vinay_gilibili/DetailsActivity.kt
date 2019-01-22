package com.example.vinay_gilibili

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import com.epita.fr.androidabdulghibli.R
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity : AppCompatActivity() {

    lateinit internal var tv1: TextView
    lateinit internal var tv2: TextView
    lateinit internal var tv3: TextView

    lateinit internal var bt1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        tv1 = findViewById<View>(R.id.DetailsTitleTxt) as TextView
        tv2 = findViewById<View>(R.id.DetailsYearTxt) as TextView
        tv3 = findViewById<View>(R.id.DetailsDirectorTxt) as TextView



        if (intent.extras != null) {

            val test = intent.extras!!.getString("test")

            val years = intent.extras!!.getString("years")
            val directors = intent.extras!!.getString("directors")

            tv1.text = test

            tv2.text= years
            tv3.text = directors
            var searchString: String= "http://www.google.com/search?"+test

        }

        google_btn.setOnClickListener {

            bt1.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/search?q=")))
            }
        }





    }
}
