package com.ray

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://data.taipei/api/dataset/758e5ae0-e6ee-448b-81f5-316eb68a5ba7/resource/a63e3278-9d10-4916-9f24-e5a4d78afb31/download")
   println(url.readText())
    /* with(url.openConnection() as HttpURLConnection) {
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
    }*/
}