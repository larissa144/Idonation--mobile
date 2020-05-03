package com.example.idonation

import feign.Headers
import feign.RequestLine

interface LoginRequests {

    @RequestLine("POST /pessoa/login")
    @Headers("Content-Type: application/json")
    fun postLogin(loginPf: String) : Login_cpf_data
}