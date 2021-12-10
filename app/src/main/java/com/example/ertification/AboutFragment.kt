package com.example.ertification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutFragment : Fragment() {
    lateinit var developersRecyclerView:RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_about, container, false)
        val devolepersName:List<String> = listOf("Lena","Rena")

        developersRecyclerView=view.findViewById(R.id.devolepers_recycler_view)
        developersRecyclerView.layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        developersRecyclerView.adapter=DevoleperAdapter(devolepersName)
        return view
    }

}