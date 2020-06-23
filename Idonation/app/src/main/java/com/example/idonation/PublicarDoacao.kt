package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PublicarDoacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publicar_doacao)
    }

    fun fazerLogin(v: View){

        val fazerLogin = Intent(this, home1_doador::class.java)

        startActivity(fazerLogin)

    }

    fun  irTelaOutros(v: View){

        val irTelaOutros = Intent(this,  Outros::class.java)

        startActivity(irTelaOutros)

    }

    fun voltarHomeDoador(v: View){

        val  voltarHomeDoador = Intent(this, home1_doador::class.java)

        startActivity( voltarHomeDoador)

    }









}
