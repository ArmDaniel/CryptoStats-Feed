package com.example.ipfsnewsfeed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.news_row.view.*



class ListAdapter(val homeFeed: HomeFeed) : RecyclerView.Adapter<CustomViewHolder>() {


    //note: okhttp version 14 throws error , keep 12 until the code is adapted for the new version


    override fun getItemCount(): Int {
        return homeFeed.data.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.news_row,parent,false)
        return CustomViewHolder(cellForRow)

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val newsTitle = homeFeed.data.get(position)
        holder?.view?.textView_newsTitle?.text = "Price in $: " + newsTitle.price_usd.toString()
        holder?.view?.textView_cont?.text = newsTitle.name
        holder?.view?.textView_tsup?.text = "Circulating supply: " + newsTitle.tsupply.toString() + "$"
        holder?.view?.textView_mkcap?.text = "Market cap: " + newsTitle.market_cap_usd.toString() + "$"

        val cryptoThumb = holder?.view?.imageView
        Picasso.get().load("https://mrcryptodude.com/wp-content/uploads/2018/10/bitcoin-storage-thumbnail-1080x675.png").into(cryptoThumb)


    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}
