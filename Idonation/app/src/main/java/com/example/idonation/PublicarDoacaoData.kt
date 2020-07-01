package com.example.idonation

data class PublicarDoacaoData(
    val categoria: String,
    val dataCriacao: String,
    val descricao: String,
    val empresa: Empresa,
    val razao_social: String,
    val idDoacao: String,
    val ong: Ong,
    val organizacao: Organizacao,
    val pessoa: UsuarioAutenticado,
    val tipoDoacao: String
)