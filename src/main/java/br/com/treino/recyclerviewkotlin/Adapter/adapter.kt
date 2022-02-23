package br.com.treino.recyclerviewkotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.treino.recyclerviewkotlin.R

class adapter : RecyclerView.Adapter<adapter.MyViewHolder>(){

    private var texto = arrayOf("bruno", "brunin", "brunão", "brubin", "brubru", "barabu", "berebu")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_lista, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.texto.text = texto[position]
    }

    override fun getItemCount(): Int {
        return texto.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var texto: TextView
        init {
            texto = itemView.findViewById(R.id.textView)
        }
    }

}