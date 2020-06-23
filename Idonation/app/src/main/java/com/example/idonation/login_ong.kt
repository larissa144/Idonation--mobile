package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login_ong : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_ong)
    }

    fun irTelaCriarContaOng(v: View) {

        val irTelaCriarContaOng = Intent(this, CadOngPartUm::class.java)

        startActivity(irTelaCriarContaOng)
    }

    fun fazerLogin(v: View){

        val fazerLogin = Intent(this, Home1Ongs::class.java)

        startActivity(fazerLogin)

    }
}
