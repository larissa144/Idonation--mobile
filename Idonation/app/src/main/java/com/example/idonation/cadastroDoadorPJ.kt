package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.idonation.http.HttpHelper
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_cadastro_doador.*
import kotlinx.android.synthetic.main.activity_cadastro_doador_p_j.*
import org.jetbrains.anko.doAsync

class cadastroDoadorPJ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_doador_p_j)
    }


    fun cadastrarPJ(v: View){

        val razao_social = razaoSocialPJ.text.toString()
        val cnpj = cnpjPJ.text.toString()
        val email = emailPJ.text.toString()
        val password = senhaPJ.text.toString()

        val cadastroDois = UsuarioCadastroPJ(cnpj, razao_social, email, pass = PassCnpj(cnpj, password))

        val task = PostCadPjTask()

        val resposta = task.execute(cadastroDois).get()


        val cadastrar = Intent(this, login_cnpj::class.java)

        startActivity(cadastrar)

    }
}
