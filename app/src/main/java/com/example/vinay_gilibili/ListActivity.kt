package com.example.vinay_gilibili

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.Toast
import com.epita.fr.androidabdulghibli.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity()  {

    private var listNotes = ArrayList<Film>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        listNotes.add(Film("1997", "Titanic", "James Cameron"))
        listNotes.add(Film("2015", "Inception", "Christopher Nolan"))
        listNotes.add(Film("2018", "Black Panther", "Marvel"))
        listNotes.add(Film("2014", "Interstellar", "Nolan"))
        listNotes.add(Film("2015", "Martian", "Ridley Scott"))


        var notesAdapter = NotesAdapter(this, listNotes)
        country_list.adapter = notesAdapter
        country_list.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->

            val i: Intent = Intent(applicationContext,DetailsActivity :: class.java)

            val b = Bundle()
            b.putString("test",listNotes[position].title)
            b.putString("years",listNotes[position].year)
            b.putString("directors",listNotes[position].director)
            i.putExtras(b)
            Toast.makeText(this, "Click on " + listNotes[position].title, Toast.LENGTH_SHORT).show()
            startActivity(i)
        }

    }
}