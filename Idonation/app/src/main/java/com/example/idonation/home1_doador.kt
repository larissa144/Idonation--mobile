package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class home1_doador : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1_doador)
    }


    fun irTelaConfiguracoes(v: View){

        val irTelaConfiguracoes = Intent(this, Configuracoes::class.java)

        startActivity(irTelaConfiguracoes)
    }

    fun irTelaPublicarDoacao(v: View){

        val  irTelaPublicarDoacao = Intent(this, PublicarDoacao::class.java)

        startActivity(irTelaPublicarDoacao)
    }

    fun irTelaPublicacao(v: View){

        val  irTelaPublicacao = Intent(this, Outros::class.java)

        startActivity(irTelaPublicacao)
    }

    fun irTelaFazerDoacao(v: View){

        val irTelaFazerDoacao = Intent(this, FazerDoacao::class.java )
        startActivity(irTelaFazerDoacao)
    }


}
