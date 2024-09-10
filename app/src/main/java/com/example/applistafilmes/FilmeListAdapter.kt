package com.example.applistafilmes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.applistafilmes.databinding.ItemFilmeBinding

class FilmeListAdapter(

): RecyclerView.Adapter<FilmeListAdapter.FilmeViewHolder>() {

    private val filmes = arrayListOf<Filme>()

    fun setFilmes(filmesList: ArrayList<Filme>) {
        filmes.clear()
        filmes.addAll(filmesList)
    }


    class FilmeViewHolder(
        private val binding: ItemFilmeBinding
    ):RecyclerView.ViewHolder(binding.root){

        fun bind(filme: Filme){
            binding.txtTitulo.text = filme.titulo
            binding.imgFilme.load(filme.imagem){
                crossfade(true)
                crossfade(1000)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val binding = ItemFilmeBinding.inflate(LayoutInflater.from(parent.context), parent,  false)
        return FilmeViewHolder(binding)
    }

    override fun getItemCount() = filmes.size


    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.bind(filmes[position])
    }


}




