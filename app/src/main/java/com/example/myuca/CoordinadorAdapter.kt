package com.example.myuca

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myuca.databinding.ItemCoordinadorBinding


class CoordinadorAdapter(private val coordinadores: List<Coordinador>) :
    RecyclerView.Adapter<CoordinadorAdapter.CoordinadorViewHolder>() {

    inner class CoordinadorViewHolder(private val binding: ItemCoordinadorBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(coordinador: Coordinador) {
            binding.textViewNombres.text = coordinador.nombres
            binding.textViewApellidos.text = coordinador.apellidos
            binding.textViewFechaNac.text = coordinador.fechaNac
            binding.textViewTitulo.text = coordinador.titulo
            binding.textViewEmail.text = coordinador.email
            binding.textViewFacultad.text = coordinador.facultad
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoordinadorViewHolder {
        val binding = ItemCoordinadorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoordinadorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoordinadorViewHolder, position: Int) {
        holder.bind(coordinadores[position])
    }

    override fun getItemCount(): Int {
        return coordinadores.size
    }
}