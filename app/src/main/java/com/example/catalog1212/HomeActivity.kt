package com.example.catalog1212

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController

class HomeActivity : AppCompatActivity() {
//    private lateinit var botNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)

//            val navView: BottomNavigationView = findViewById(R.id.nav_view)

            var navController = findNavController(R.id.nav_host_fragment)

            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            navController = navHostFragment.navController

//            navView.setupWithNavController(navController)
        } catch (e: Exception) {
            Log.e("Error", e.toString())}

//        botNav = findViewById<BottomNavigationView>(R.id.bottom)

//        botNav.setOnNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.navigation_linear -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.hfragments, LinearFragment()).commit()
//                }
//
//                R.id.navigation_grid -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.hfragments, GridFragment()).commit()
//
//                }
//            }
//            true
//        }
    }
}