package com.example.idonation

import android.os.AsyncTask
import feign.FeignException

class PostCadOngTask: AsyncTask<UsuarioCadastroOng, Void, UsuarioCadastroOng>() {


    override fun doInBackground(vararg params: UsuarioCadastroOng): UsuarioCadastroOng? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postCadOng(params[0])
        }
        catch (e: FeignException){
            e.printStackTrace()
            return null
        }

    }
}