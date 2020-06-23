package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login_cpf.*

class login_cnpj : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cnpj)
    }

    fun irTelaCriarConta(v: View) {

        val irTelaCriarConta = Intent(this, cad_doadro_pass1::class.java)

        startActivity(irTelaCriarConta)
    }

    fun fazerLogin(v: View){

        val fazerLogin = Intent(this, home1_doador::class.java)

        startActivity(fazerLogin)

    }
}
