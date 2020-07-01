package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login_cnpj.*
import kotlinx.android.synthetic.main.activity_login_ong.*

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

    fun fazerLoginOng(v: View){

        val cnpj = inputLoginOng.text.toString()
        val password = inputLoginOng2.text.toString()

        val loginCnpj = UsuarioLoginCnpj(cnpj, password)

        val task = PostLoginOngTask()

        val resposta = task.execute(loginCnpj).get()

//        Toast.makeText(this, resposta?.nome, Toast.LENGTH_SHORT).show()

        val fazerLoginONG = Intent(this, Home1Ongs::class.java)

        startActivity(fazerLoginONG)

    }
}
