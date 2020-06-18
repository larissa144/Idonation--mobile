package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun irTelaDoador(v: View) {

        val telaDoador = Intent(this, LoginCpfActivity::class.java)

        startActivity(telaDoador)
    }

    fun irTelaOng(v: View) {

        val telaOng = Intent(this, login_ong::class.java)

        startActivity(telaOng)
    }
}
