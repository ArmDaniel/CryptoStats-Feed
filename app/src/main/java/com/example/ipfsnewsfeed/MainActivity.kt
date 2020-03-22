package com.example.ipfsnewsfeed


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = ListAdapter()

        fetchJson()

    }

    fun fetchJson()
    {

        //Use first URL to fetch top stories, then feed some 10 id's to the second url below (eg: 8863.json )

        val url = " https://hacker-news.firebaseio.com/v0/item/8863.json?print=pretty"

        var request = Request.Builder().url(url).build()

        val client = OkHttpClient()
        client.newCall(request).enqueue(object: Callback{

            override fun onResponse(call: Call, response: Response) {
                val body = response?.body()?.string()
                println(body)
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Could not execute!")
            }
        })
    }
}
