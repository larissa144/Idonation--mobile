package com.example.idonation

import android.os.AsyncTask
import feign.FeignException


class PostLoginOngTask: AsyncTask<UsuarioLoginCnpj, Void, UsuarioAutenticadoOng>() {


    override fun doInBackground(vararg params: UsuarioLoginCnpj): UsuarioAutenticadoOng? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postLoginOng(params[0])
        }
        catch (e: FeignException){
            e.printStackTrace()
            return null
        }

    }
}