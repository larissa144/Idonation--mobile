package com.example.idonation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CadOngPartUm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_ong_part_um)

    }

    fun irTelaLoginOng(v: View) {

        val irTelaLoginOng = Intent(this, login_ong::class.java)

        startActivity(irTelaLoginOng)


    }


}
