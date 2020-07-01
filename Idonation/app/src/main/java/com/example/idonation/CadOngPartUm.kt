package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_cad_ong_part_um.*
import kotlinx.android.synthetic.main.activity_cadastro_doador_p_j.*

class CadOngPartUm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_ong_part_um)

    }

    fun irTelaLoginOng(v: View) {

        val irTelaLoginOng = Intent(this, login_ong::class.java)

        startActivity(irTelaLoginOng)


    }

    fun cadastrarOng(v: View){

        val razao_social = razaoSocialOng.text.toString()
        val cnpj = cnpjOng.text.toString()
        val email = emailOng.text.toString()
        val password = senhaOng.text.toString()
        val descricao = descriçãoOng.text.toString()
        val categoria = categoriaOng.text.toString()


        val cadastroTres = UsuarioCadastroOng(cnpj, razao_social, email, descricao, categoria, pass = PassCnpj(cnpj, password))

        val task = PostCadOngTask()

        val resposta = task.execute(cadastroTres).get()


        val cadastrar = Intent(this, login_ong::class.java)

        startActivity(cadastrar)

    }


}
