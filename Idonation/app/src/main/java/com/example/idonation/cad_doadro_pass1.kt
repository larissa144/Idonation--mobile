package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cad_doadro_pass1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_doadro_pass1)
    }

    fun irTelaAcessarConta(v: View) {

        val irTelaAcessarConta = Intent(this, login_cpf::class.java)

        startActivity(irTelaAcessarConta)
    }

    fun irTelaCriarContaPF(v: View) {

        val irTelaCriarContaPF = Intent(this, cadastroDoador::class.java)

        startActivity(irTelaCriarContaPF)
    }

    fun irTelaCriarContaPJ(v: View) {

        val irTelaCriarContaPJ = Intent(this, cadastroDoadorPJ::class.java)

        startActivity(irTelaCriarContaPJ)
    }
}
