package com.example.ertification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun  replaceFragment(fragment:Fragment) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container,fragment)
                .commit()
        }
        bottomNavigationView=findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemReselectedListener { item->
            var fragment: Fragment?=null
            when(item.itemId) {
                R.id.dice_roll-> {
                    fragment=DiceRollFragment()
                }
                R.id.about->{
                    fragment=AboutFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }

        bottomNavigationView.selectedItemId=R.id.dice_roll
    }
}