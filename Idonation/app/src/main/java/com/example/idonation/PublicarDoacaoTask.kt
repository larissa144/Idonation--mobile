package com.example.idonation

import android.os.AsyncTask
import feign.FeignException

class PublicarDoacaoTask: AsyncTask<PublicarDoacaoSelect, Void, PublicarDoacaoData>() {


    override fun doInBackground(vararg params: PublicarDoacaoSelect): PublicarDoacaoData? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postPublicarDoacao(params[0])
        }
        catch (e: FeignException){
            e.printStackTrace()
            return null
        }

    }
}