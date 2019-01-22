package com.example.vinay_gilibili

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.epita.fr.androidabdulghibli.R

class NotesAdapter: BaseAdapter {
    private var notesList = ArrayList<Film>()
    private var context: Context? = null

    constructor(context: Context, notesList: ArrayList<Film>) : super() {
        this.notesList = notesList
        this.context = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        val view: View?
        val vh: ViewHolder

        if (convertView == null) {
            val layoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.note, parent, false)
            vh = ViewHolder(view)
            view.tag = vh
            Log.i("JSA", "set Tag for ViewHolder, position: " + position)
        } else {
            view = convertView
            vh = view.tag as ViewHolder
        }

        vh.countryTitle.text = notesList[position].title
        vh.countrySubtitle.text = notesList[position].director

        return view
    }

    override fun getItem(position: Int): Any {
        return notesList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return notesList.size
    }
}

private class ViewHolder(view: View?) {
    val countryTitle: TextView
    val countrySubtitle: TextView

    init {
        this.countryTitle = view?.findViewById(R.id.textView_countryName) as TextView
        this.countrySubtitle = view?.findViewById(R.id.textView_countryCapital) as TextView
    }

}