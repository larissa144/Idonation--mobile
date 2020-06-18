package com.example.idonation

import feign.Headers
import feign.RequestLine

interface PessoaRequests {

    @RequestLine("POST /pessoa/login")
    @Headers("Content-Type: application/json")
    fun postLogin(loginPf: UsuarioLogin) : UsuarioAutenticado
}