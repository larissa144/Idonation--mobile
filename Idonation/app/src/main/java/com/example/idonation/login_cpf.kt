package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login_cpf.*

class login_cpf : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cpf)
    }

    fun irTelaCriarConta(v: View) {

        val irTelaCriarConta = Intent(this, cad_doadro_pass1::class.java)

        startActivity(irTelaCriarConta)
    }

    fun fazerLogin(v: View){

        val cpf = inputLogin.text.toString()
        val senha = inputLogin2.text.toString()

        val login = Login_cpf_data(cpf, senha)

        val res = PostLoginTask()

        res.execute(login.toString())


    }
}
