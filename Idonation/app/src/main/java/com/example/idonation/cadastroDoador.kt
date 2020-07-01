package com.example.idonation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.idonation.http.HttpHelper
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_cadastro_doador.*
import kotlinx.android.synthetic.main.activity_login_cpf.*
import org.jetbrains.anko.doAsync

class cadastroDoador : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_doador)

    }

    fun irTelaLoginCPF(v: View) {

        val irTelaLoginCPF = Intent(this, LoginCpfActivity::class.java)

        startActivity(irTelaLoginCPF)


    }

    fun cadastrarPf(v: View){

        val nome = nomePF.text.toString()
        val cpf = cpfPF.text.toString()
        val email = emailPF.text.toString()
        val senha = senhaPF.text.toString()

        val cadastro = UsuarioCadastro(cpf, senha, nome, email, pass = Pass(cpf, senha))

        val task = PostCadPfTask()

        val resposta = task.execute(cadastro).get()

//        Toast.makeText(this, resposta?.nome, Toast.LENGTH_SHORT).show()

        val cadastrar = Intent(this, LoginCpfActivity::class.java)

        startActivity(cadastrar)

    }
}
