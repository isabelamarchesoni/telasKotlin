package br.edu.fatecpg.livros.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.livros.R

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val edtTitulo = findViewById<EditText>(R.id.edt_titulo_livro)
        val edtAutor = findViewById<EditText>(R.id.edt_autor)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)

        btnCadastrar.setOnClickListener {
            val titulo = edtTitulo.text.toString()
            val autor = edtAutor.text.toString()

            val intent = Intent(this, DetalhesActivity::class.java)
            intent.putExtra("titulo", titulo)
            intent.putExtra("autor", autor)

            startActivity(intent)
        }
    }
}