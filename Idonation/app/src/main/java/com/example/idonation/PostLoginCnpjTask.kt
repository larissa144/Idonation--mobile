package com.example.idonation

import android.os.AsyncTask
import feign.FeignException

class PostLoginCnpjTask: AsyncTask<UsuarioLoginCnpj, Void, UsuarioAutenticadoCnpj>() {


    override fun doInBackground(vararg params: UsuarioLoginCnpj): UsuarioAutenticadoCnpj? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postLoginCnpj(params[0])
        }
        catch (e: FeignException){
            e.printStackTrace()
            return null
        }

    }
}