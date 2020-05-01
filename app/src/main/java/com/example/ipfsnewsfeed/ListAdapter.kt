package com.example.ipfsnewsfeed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.news_row.view.*



class ListAdapter(val homeFeed: HomeFeed) : RecyclerView.Adapter<CustomViewHolder>() {


    //note: okhttp version 14 throws error , keep 12


    override fun getItemCount(): Int {
        return 10 //homeFeed.pairs.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.news_row,parent,false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val newsTitle = homeFeed.data.get(position)
        holder?.view?.textView_newsTitle?.text = newsTitle.price_usd.toString()

        holder?.view?.textView_cont?.text = newsTitle.name




    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}