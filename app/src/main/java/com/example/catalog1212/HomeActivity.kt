package com.example.catalog1212

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catalog1212.Fragments.GridFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var botNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        botNav = findViewById(R.id.bottom)

        botNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_linear -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.hfragments, LinearFragment()).commit()
                }

                R.id.navigation_grid -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.hfragments, GridFragment()).commit()

                }
            }
            true
        }
    }
}