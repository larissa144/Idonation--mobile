package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_cpf.*

class LoginCpfActivity : AppCompatActivity() {

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

        val login = UsuarioLogin(cpf, senha)

        val task = PostLoginTask()

        val resposta = task.execute(login).get()

        Toast.makeText(this, resposta?.nome, Toast.LENGTH_SHORT).show()


    }
}
