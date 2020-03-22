# IPFS-News-Feed

<-----WARNING-----> 
This is not stable and far from being finished. Any testing can freely be made,issues opened etc., but do take care.


This app aims at building a news feed by means of the Hacker News API.
Later updates will integrate IPFS as a means for storage and file sharing.

This has many advantages and I highly suggest you pay a visit to : https://ipfs.io/

<--For those who only wish to quickly know what was used-->

All dependencies used(also specified in gradle build, if others will be added, I shall update this list):
* RecyclerView: https://developer.android.com/reference/android/support/v7/widget/RecyclerView
* OkHTTP: https://square.github.io/okhttp/
* GSON: https://github.com/google/gson
* Picasso: https://square.github.io/picasso/
* IPFS Kotlin Api : https://github.com/ligi/ipfs-api-kotlin

TODO: Fetch top stories from HN and send to news queue; Integrate IPFS for storage ( save news ) and file sharing ( allow users to write their
own articles and publish to IPFS node ) ; Material design for app (?)
