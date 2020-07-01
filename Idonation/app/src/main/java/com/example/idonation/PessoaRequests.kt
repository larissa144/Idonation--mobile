package com.example.idonation

import feign.Headers
import feign.RequestLine

interface PessoaRequests {

    @RequestLine("POST /pessoa/login")
    @Headers("Content-Type: application/json")
    fun postLogin(loginPF: UsuarioLogin) : UsuarioAutenticado

    @RequestLine("POST /empresa/login")
    @Headers("Content-Type: application/json")
    fun postLoginCnpj(loginCnpj: UsuarioLoginCnpj) : UsuarioAutenticadoCnpj

    @RequestLine("POST /Organizacao/login")
    @Headers("Content-Type: application/json")
    fun postLoginOng(loginOng: UsuarioLoginCnpj) : UsuarioAutenticadoOng

    @RequestLine("POST /pessoa/cadastrar")
    @Headers("Content-Type: application/json")
    fun postCadPF(cadPf: UsuarioCadastro) : UsuarioCadastro

}