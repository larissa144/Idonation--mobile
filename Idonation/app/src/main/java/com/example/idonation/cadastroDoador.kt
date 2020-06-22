package com.example.idonation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.idonation.http.HttpHelper
import com.google.gson.Gson
import org.jetbrains.anko.doAsync

class cadastroDoador : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_doador)

        val enviarCadastro = findViewById<Button>(R.id.enviarCadastroPF)

        val nomePF = findViewById<EditText>(R.id.nomePF)
        val cpfPF = findViewById<EditText>(R.id.cpfPF)
        val emailPF = findViewById<EditText>(R.id.emailPF)
        val senhaPF = findViewById<EditText>(R.id.senhaPF)
        val confirmarSenhaPF = findViewById<EditText>(R.id.confirmarSenhaPF)

        enviarCadastro.setOnClickListener {
            val cadastroPf = UsuarioCadastro()

            cadastroPf.nomePF = nomePF.text.toString()
            cadastroPf.cpfPF = cpfPF.text.toString()
            cadastroPf.emailPF = emailPF.text.toString()
            cadastroPf.senhaPF = senhaPF.text.toString()
            cadastroPf.confirmarSenhaPF = confirmarSenhaPF.text.toString()

            val gson = Gson()
            val cadastroPfJson = gson.toJson(cadastroPf)

            doAsync {
                val http = HttpHelper()

                http.post(cadastroPfJson)
            }

        }

    }
}
