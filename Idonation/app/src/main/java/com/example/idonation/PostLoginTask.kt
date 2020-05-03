package com.example.idonation

import android.os.AsyncTask
import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder

class PostLoginTask: AsyncTask<String, Void, Login_cpf_data>() {


    override fun doInBackground(vararg params: String?): Login_cpf_data {
        val request = Feign.builder()
            .decoder(GsonDecoder())
            .encoder(GsonEncoder())
            .target(LoginRequests::class.java, "https://back-idonation.herokuapp.com/api")
        return request.postLogin(params[0]!!)


    }
}
