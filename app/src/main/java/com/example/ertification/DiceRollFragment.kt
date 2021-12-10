package com.example.ertification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DiceRollFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DiceRollFragment : Fragment() {

 lateinit var diceImageView:ImageView
 lateinit var  rollButton:Button
 private val daceImageList:List<Int> = listOf(
     R.drawable.d1,
     R.drawable.d2,
     R.drawable.d3,
     R.drawable.d4,
     R.drawable.d5,
     R.drawable.d6
 )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val  view=inflater.inflate(R.layout.fragment_dice_roll, container, false)
        diceImageView=view.findViewById(R.id.image_dice_view)
        rollButton=view.findViewById(R.id.roll_button)

        rollButton.setOnClickListener{

          diceImageView.setImageResource(daceImageList.random())
        }
        return view
    }


}