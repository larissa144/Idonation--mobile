package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login_cnpj.*
import kotlinx.android.synthetic.main.activity_login_cpf.*
import kotlinx.android.synthetic.main.activity_login_cpf.inputLogin2
import kotlinx.android.synthetic.main.activity_login_ong.*

class login_cnpj : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cnpj)
    }

    fun irTelaCriarConta(v: View) {

        val irTelaCriarConta = Intent(this, cad_doadro_pass1::class.java)

        startActivity(irTelaCriarConta)
    }


    fun fazerLoginCnpj(v: View){

        val cnpj = inputLoginOng.text.toString()
        val password = inputLoginOng2.text.toString()

        val loginCnpj = UsuarioLoginCnpj(cnpj, password)

        val task = PostLoginCnpjTask()

        val resposta = task.execute(loginCnpj).get()

//        Toast.makeText(this, resposta?.nome, Toast.LENGTH_SHORT).show()

        val fazerLoginCNPJ = Intent(this, home1_doador::class.java)

        startActivity(fazerLoginCNPJ)

    }
}
