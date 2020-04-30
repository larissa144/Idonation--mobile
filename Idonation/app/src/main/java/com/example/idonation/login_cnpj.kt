package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login_cnpj : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cnpj)
    }

    fun irTelaCriarConta(v: View) {

        val irTelaCriarConta = Intent(this, cad_doadro_pass1::class.java)

        startActivity(irTelaCriarConta)
    }
}
