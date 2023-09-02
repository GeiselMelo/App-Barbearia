package com.example.appbarbearia.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appbarbearia.databinding.ServicosItemBinding
import com.example.appbarbearia.model.Servicos

class ServicosAdapter(private val context: Context, private val listaServicos: MutableList<Servicos>):
    RecyclerView.Adapter<ServicosAdapter.SercosViewHolder>() {



    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SercosViewHolder {
      val itemLista = ServicosItemBinding.inflate(LayoutInflater.from(context),parent, false)
        return SercosViewHolder(itemLista)
    }

    override fun getItemCount() = listaServicos.size

    override fun onBindViewHolder(holder: SercosViewHolder, position: Int) {
       holder.imgServico.setImageResource(listaServicos[position].img!!)
        holder.txtServico.text = listaServicos[position].nome
    }

    inner class SercosViewHolder(binding: ServicosItemBinding): RecyclerView.ViewHolder(binding.root){
        val imgServico = binding.imgServico
        val txtServico = binding.txtServico
    }

}