package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fazer_doacao.*
import kotlinx.android.synthetic.main.activity_publicar_doacao.*

class PublicarDoacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publicar_doacao)
    }

    fun fazerLogin(v: View){

        val fazerLogin = Intent(this, home1_doador::class.java)

        startActivity(fazerLogin)

    }

    fun voltarHomeDoador(v: View){

        val  voltarHomeDoador = Intent(this, home1_doador::class.java)

        startActivity( voltarHomeDoador)

    }



    fun irTelaOutros(v: View){

        val categoria = etCategoria.text.toString()
        val tipoDoacao = etDestinado.text.toString()
        val descricao = etDesc.text.toString()


        val fazerDoacao = PublicarDoacaoSelect(categoria, tipoDoacao, descricao )

        val task = PublicarDoacaoTask()

        val resposta = task.execute(fazerDoacao).get()

//        Toast.makeText(this, resposta?.nome, Toast.LENGTH_SHORT).show()

        val fazerdoacao = Intent(this, home1_doador::class.java)

        startActivity(fazerdoacao)

    }







}
