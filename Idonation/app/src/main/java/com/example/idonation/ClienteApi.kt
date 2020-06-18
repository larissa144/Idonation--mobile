package com.example.idonation

import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder

object ClienteApi {

    fun criarClientePessoa(): PessoaRequests {
       return  Feign.builder()
            .decoder(GsonDecoder())
            .encoder(GsonEncoder())
            .target(PessoaRequests::class.java, "https://back-idonation.herokuapp.com/api")

    }

}