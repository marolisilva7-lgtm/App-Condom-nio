package com.example.appcondominio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val boletos = findViewById<Button>(R.id.boletos)

        boletos.setOnClickListener {
            val x= Intent ( this, BoletosActivity::class.java)
            startActivity(x)
        }

        val reservas = findViewById<Button>(R.id.Reserva)

        reservas.setOnClickListener {
            val x= Intent ( this, ReservaActivity::class.java)
            startActivity(x)
        }

        val auto = findViewById<Button>(R.id.auto)

        auto.setOnClickListener {
            val x= Intent ( this, AutorizacaoActivity::class.java)
            startActivity(x)
        }

        val mural = findViewById<Button>(R.id.mural)

        mural.setOnClickListener {
            val x= Intent ( this, MuralActivity::class.java)
            startActivity(x)
        }

        val mudanca = findViewById<Button>(R.id.btnMudanca)

        mudanca.setOnClickListener {
            val x= Intent ( this, MudancaActivity::class.java)
            startActivity(x)
        }


    }
}