package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_fazer_doacao.*
import kotlinx.android.synthetic.main.activity_login_cpf.*
import kotlinx.android.synthetic.main.activity_publicar_doacao.*

class FazerDoacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fazer_doacao)
    }

    fun cancelarDoacao(v: View){

        val  voltarHomeDoador = Intent(this, home1_doador::class.java)

        startActivity( voltarHomeDoador)
    }

    fun finalizarDoacao(v: View){

        val categoria = etCategoriaDoacao.text.toString()
        val tipoDoacao = etDestinadoDoacao.text.toString()
        val descricao = etDescDoacao.text.toString()
        val razaoSocil = etRazaoSocial.text.toString()



        val fazerDoacao = FazerDoacaoSelect(categoria, tipoDoacao, descricao, razaoSocil )

        val task = FazerDoacaoTask()

        val resposta = task.execute(fazerDoacao).get()

//        Toast.makeText(this, resposta?.nome, Toast.LENGTH_SHORT).show()

        val fazerdoacao = Intent(this, home1_doador::class.java)

        startActivity(fazerdoacao)

    }
}
