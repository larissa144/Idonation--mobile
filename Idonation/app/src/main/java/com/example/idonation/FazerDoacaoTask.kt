package com.example.idonation

import android.os.AsyncTask
import feign.FeignException

class FazerDoacaoTask: AsyncTask<FazerDoacaoSelect, Void, PublicarDoacaoData>() {


    override fun doInBackground(vararg params: FazerDoacaoSelect): PublicarDoacaoData? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postFazerDoacao(params[0])
        }
        catch (e: FeignException){
            e.printStackTrace()
            return null
        }

    }
}