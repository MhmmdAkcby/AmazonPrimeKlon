package com.akcabeymuhammed.amazonprimeklon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.akcabeymuhammed.amazonprimeklon.databinding.ActivityMainBinding
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.DownloadFragment
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.HomeFragment
import com.akcabeymuhammed.amazonprimeklon.ui.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(2000)
        installSplashScreen()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment1) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavMenu, navHostFragment.navController)

    }
}