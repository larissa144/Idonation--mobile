package com.example.idonation

import android.os.AsyncTask
import feign.FeignException

class PostCadPfTask: AsyncTask<UsuarioCadastro, Void, UsuarioCadastro>() {

    override fun doInBackground(vararg params: UsuarioCadastro): UsuarioCadastro? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postCadPF(params[0])
        }
        catch (e: FeignException){
            e.printStackTrace()
            return null
        }

    }
}