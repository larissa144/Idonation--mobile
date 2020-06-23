package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Outros: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outros)
    }

    fun  visualizar(v: View){

        val  visualizar = Intent(this, publicacoesMatchOng::class.java)

        startActivity( visualizar)

    }


}
