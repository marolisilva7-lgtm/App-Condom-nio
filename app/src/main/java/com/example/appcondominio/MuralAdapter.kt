package com.example.appcondominio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MuralAdapter(private val  comunicados : List<String>): RecyclerView.Adapter<MuralAdapter.MuralViewHolder>() {
    class MuralViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val item: TextView = itemView.findViewById(R.id.txtMural)
    }

    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): MuralAdapter.MuralViewHolder {
        val view = LayoutInflater.from(p0.context)
            .inflate(R.layout.item_reserva,p0,false)
        return MuralViewHolder( view)

    }

    override fun onBindViewHolder(holder: MuralAdapter.MuralViewHolder, position: Int) {
        val reserva = comunicados[position]
        holder.item.text = reserva


    }

    override fun getItemCount(): Int {
        return  comunicados.size
    }
}

