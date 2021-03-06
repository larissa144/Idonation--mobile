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

    @RequestLine("POST /empresa/cadastrar")
    @Headers ("Content-Type: application/json")
    fun postCadPJ(cadPj: UsuarioCadastroPJ) : UsuarioCadastroPJ

    @RequestLine("POST /Organizacao/cadastrar")
    @Headers("Content-Type: application/json")
    fun postCadOng(cadOng: UsuarioCadastroOng) : UsuarioCadastroOng

    @RequestLine("POST /donation/addDonation")
    @Headers("Content-Type: application/json")
    fun postPublicarDoacao(publicarDoacao: PublicarDoacaoSelect) : PublicarDoacaoData

    @RequestLine("POST /donation/addDonation")
    @Headers("Content-Type: application/json")
    fun postFazerDoacao(fazerDoacao: FazerDoacaoSelect) : PublicarDoacaoData


}