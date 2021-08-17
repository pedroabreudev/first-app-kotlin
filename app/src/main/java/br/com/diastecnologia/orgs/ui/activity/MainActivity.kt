package br.com.diastecnologia.orgs.ui.activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.diastecnologia.orgs.R
import br.com.diastecnologia.orgs.model.Produto
import br.com.diastecnologia.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "teste desc",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 2",
                    descricao = "teste desc 2",
                    valor = BigDecimal("20.99")
                ),
            )
        )
    }
}