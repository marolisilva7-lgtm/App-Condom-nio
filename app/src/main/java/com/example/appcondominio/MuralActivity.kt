package com.example.appcondominio

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MuralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mural)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    val toolbarMural = findViewById<Toolbar>(R.id.toolbarMural)
    toolbarMural.title = "Mural"
    setSupportActionBar(toolbarMural)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.setDisplayShowHomeEnabled(true)

    val rc = findViewById<RecyclerView>(R.id.recyclerMural)
    rc.layoutManager = LinearLayoutManager(this)
    val comunicados = listOf(
        "Novo Bicicletário",
        "Portão de veículos",
        "Alarme de incêndio",
        "Festa Jnina"
    )
    rc.adapter = ReservaAdapter(comunicados)

}

override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return when (item.itemId) {
        android.R.id.home -> {
            finish() // Volta para a tela anterior
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}
}