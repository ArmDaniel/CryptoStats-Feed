package com.example.ipfsnewsfeed


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException
import io.ipfs.kotlin.defaults.LocalIPFS
import android.widget.Button
import android.widget.Toast
import io.ipfs.kotlin.defaults.InfuraIPFS
import android.os.StrictMode
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)


        fetchJson()

        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()

        StrictMode.setThreadPolicy(policy)

        val button = findViewById<Button>(R.id.button)
        val multihash = InfuraIPFS().add.string("test-string").Hash
        val content = InfuraIPFS().get.cat(multihash)

        button?.setOnClickListener { Toast.makeText(this@MainActivity, content , Toast.LENGTH_LONG).show() }



    }




    fun fetchJson()
    {

        
        val url = "https://api.coinlore.net/api/tickers/"


        var request = Request.Builder().url(url).build()



        val client = OkHttpClient()

        client.newCall(request).enqueue(object: Callback{

            override fun onResponse(call: Call?, response: Response?) {
                val body = response?.body()?.string()
                println(body)


                val gson = GsonBuilder().create()
                val homeFeed = gson.fromJson(body, HomeFeed::class.java)

                runOnUiThread {
                    recyclerView_main.adapter = ListAdapter(homeFeed)
                }
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Could not execute!")
            }
        })


    }
}



class HomeFeed(val data : List<Coins>)

class Coins(val price_usd: Float , val name: String)


