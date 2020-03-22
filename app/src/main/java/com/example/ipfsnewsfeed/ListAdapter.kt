package com.example.ipfsnewsfeed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.news_row.view.*

class ListAdapter : RecyclerView.Adapter<CustomViewHolder>() {
    //push to list the titles, then make separate variable for summary
    val newsTitles = listOf<String>("1","2")
    override fun getItemCount(): Int {
        return newsTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.news_row,parent,false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val newsTitle = newsTitles.get(position)
        holder?.view?.textView_newsTitle?.text = newsTitle

    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}