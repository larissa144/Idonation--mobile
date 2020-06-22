package com.example.idonation.http

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

class HttpHelper {

    fun post (json: String): String? {

        val URL = "https://back-idonation.herokuapp.com/api/pessoa/cadastrar"

        val headerHttp = "application/json; charset=utf-8".toMediaTypeOrNull()

        val client = OkHttpClient()

        val body = json.toRequestBody(headerHttp)

        val requestR = Request.Builder().url(URL).post(body).build()

        val responseR = client.newCall(requestR).execute()

        return responseR.body?.string()

    }

    fun postPj (json: String): String? {

        val URL = "https://back-idonation.herokuapp.com/api/empresa/cadastrar"

        val headerHttp = "application/json; charset=utf-8".toMediaTypeOrNull()

        val client = OkHttpClient()

        val body = json.toRequestBody(headerHttp)

        val requestR = Request.Builder().url(URL).post(body).build()

        val responseR = client.newCall(requestR).execute()

        return responseR.body?.string()

    }

    fun getMatch () {

        val URL = "https://back-idonation.herokuapp.com/api/match/user/"


    }
}