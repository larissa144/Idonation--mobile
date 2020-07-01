package com.example.idonation

import android.os.AsyncTask
import feign.FeignException

class PostCadPjTask: AsyncTask<UsuarioCadastroPJ, Void, UsuarioCadastroPJ>(){

    override fun doInBackground(vararg params: UsuarioCadastroPJ): UsuarioCadastroPJ? {
        val request = ClienteApi.criarClientePessoa()
        try {
            return request.postCadPJ(params[0])
        } catch (e: FeignException) {
            e.printStackTrace()
            return null
        }

    }

}
