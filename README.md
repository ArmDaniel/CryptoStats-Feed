# CryptoStats Feed

<-----WARNING----->

This is not stable and far from being finished. Any testing can freely be made,issues opened etc., but do take care.

When the stable version is going to be released ,I shall post a link to it here, for now, consider this as a testing ground.

This app aims at building a cryptocurrency news feed by means of the Coinlore API : https://www.coinlore.com/cryptocurrency-data-api.

It also supports IPFS storage and sharing via the Kotlin IPFS API ( link provided below )

This has many advantages and I highly suggest you pay a visit to : https://ipfs.io/

Analyzed using [Snyk](https://snyk.io/)

[![Known Vulnerabilities](https://snyk.io/test/github/Motanovici/CryptoStats-Feed/badge.svg?targetFile=app/build.gradle)](https://snyk.io/test/github/Motanovici/CryptoStats-Feed?targetFile=app/build.gradle)

<--For those who only wish to quickly know what was used-->

All dependencies used(also specified in gradle build, if others will be added, I shall update this list):
* RecyclerView: https://developer.android.com/reference/android/support/v7/widget/RecyclerView
* OkHTTP: https://square.github.io/okhttp/
* GSON: https://github.com/google/gson
* Picasso: https://square.github.io/picasso/
* IPFS Kotlin Api : https://github.com/ligi/ipfs-api-kotlin

TODO:

* Add an easier sharing option of the IPFS link
* Use material design for UI
* Extend to a proper decentralised News Feed
* Use OrbitDB
