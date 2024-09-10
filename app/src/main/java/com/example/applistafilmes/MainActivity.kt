package com.example.applistafilmes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applistafilmes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var filmeListAdapter: FilmeListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configFilmeList()

    }

    private fun configFilmeList(){
        val filmes = getFilmes()
        filmeListAdapter = FilmeListAdapter()
        binding.listFilmes.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        binding.listFilmes.adapter = filmeListAdapter
        filmeListAdapter.setFilmes(filmes)
    }
    private fun getFilmes(): ArrayList<Filme>{
        val filmes = arrayListOf(
            Filme(titulo= "Constantine", imagem = R.drawable.constantine),
            Filme(titulo= "Velozes e Furiosos", imagem = R.drawable.velozes),
            Filme(titulo= "Vingadores", imagem = R.drawable.vingadores),
            Filme(titulo= "Batman", imagem = R.drawable.batman),
            Filme(titulo= "Titanic", imagem = R.drawable.titanic),
            Filme(titulo= "Senhor dos Anéis", imagem = R.drawable.senhor),
            Filme(titulo= "Harry Potter", imagem = R.drawable.harry),
            Filme(titulo= "Coringa", imagem = R.drawable.coringa),
            Filme(titulo= "O Corvo", imagem = R.drawable.corvo),
            Filme(titulo= "Cidade de Deus", imagem = R.drawable.cidade),
            Filme(titulo= "O Poderoso Chefão", imagem = R.drawable.poderoso),
            Filme(titulo= "Annabelle", imagem = R.drawable.anabelle),
            Filme(titulo= "John Wick", imagem = R.drawable.jwick),
            Filme(titulo= "Halloween", imagem = R.drawable.halloween),
            Filme(titulo= "O Exorcista", imagem = R.drawable.exoecist),


        )

            return filmes
    }
}