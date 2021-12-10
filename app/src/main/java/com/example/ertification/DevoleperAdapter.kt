package com.example.ertification

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DevoleperAdapter(private val developersNames:List<String>):
    RecyclerView.Adapter<DevoleperViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DevoleperViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_list_item,parent,false)
        return DevoleperViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DevoleperViewHolder, position: Int) {
        val name=developersNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return developersNames.size
    }
}