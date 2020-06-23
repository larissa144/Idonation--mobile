package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Home1Ongs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1_ongs)
    }

    fun irTelaMatch(v: View){

        val irTelaMatch = Intent(this, match::class.java)

        startActivity(irTelaMatch)

    }
    fun irTelaOutros(v: View){

        val irTelaOutros = Intent(this, publicacoesMatchOng::class.java)

        startActivity(irTelaOutros)
    }

    fun irTelaConfiguracoes(v: View){

        val irTelaConfiguracoes = Intent(this, Configuracoes::class.java)

        startActivity(irTelaConfiguracoes)
    }
}