package br.edu.fatecpg.livros.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.livros.R

class DetalhesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val txtTitulo = findViewById<TextView>(R.id.txt_titulo_livro)
        val txtAutor = findViewById<TextView>(R.id.txt_autor)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        txtTitulo.text = "Título: $titulo"
        txtAutor.text = "Autor: $autor"
    }
}