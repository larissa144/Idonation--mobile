package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.idonation.http.HttpHelper
import com.google.gson.Gson
import org.jetbrains.anko.doAsync

class cadastroDoadorPJ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_doador_p_j)

//       val enviarcadastro = findViewById<Button>(R.id.enviarCadastroPJ)
//
//        val razaoSocial = findViewById<EditText>(R.id.razaoSocialPJ)
//        val cnpjPj = findViewById<EditText>(R.id.cnpjPJ)
//        val emailPj = findViewById<EditText>(R.id.emailPJ)
//        val senhaPj = findViewById<EditText>(R.id.senhaPJ)
//        val confirmarSenhaPj = findViewById<EditText>(R.id.confirmarSenhaPJ)
//
//        enviarcadastro.setOnClickListener {
//
//            val cadastroPj = UsuarioCadastroPJ()
//
//            cadastroPj.razaoSocial = razaoSocial.text.toString()
//            cadastroPj.cnpj = cnpjPj.text.toString()
//            cadastroPj.emailPj = emailPj.text.toString()
//            cadastroPj.senhaPJ = senhaPj.text.toString()
//            cadastroPj.confirmarSenhaPj = confirmarSenhaPj.text.toString()
//
//            val gson = Gson()
//            val cadastroPjJson = gson.toJson(cadastroPj)
//
//            doAsync {
//                val http = HttpHelper()
//
//                http.postPj(cadastroPjJson)
//            }
//        }
    }

    fun irTelaLoginCNPJ(v: View) {

        val irTelaLoginCNPJ = Intent(this, login_cnpj::class.java)

        startActivity(irTelaLoginCNPJ)


    }
}
