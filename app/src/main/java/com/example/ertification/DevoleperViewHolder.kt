package com.example.ertification

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DevoleperViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    private val devoleperNameTextView:TextView=itemView.findViewById(R.id.developer_name_text_view)

    fun bind(name:String){

        devoleperNameTextView.text=name
    }
}