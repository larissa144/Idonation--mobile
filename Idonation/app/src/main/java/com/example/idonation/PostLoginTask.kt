package com.example.idonation

import android.os.AsyncTask
import feign.FeignException

class PostLoginTask: AsyncTask<UsuarioLogin, Void, UsuarioAutenticado>() {


    override fun doInBackground(vararg params: UsuarioLogin): UsuarioAutenticado? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postLogin(params[0])
        }
        catch (e: FeignException){
            e.printStackTrace()
            return null
        }



    }
}
