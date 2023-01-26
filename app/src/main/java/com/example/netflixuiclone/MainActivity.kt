package com.example.netflixuiclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.netflixuiclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

    }
    fun init() {
        try {
            val navControl = this.findNavController(R.id.nav_host_fragment_container)
            binding.bottomNavBar.setupWithNavController(navControl)
        }catch (_: Exception) {

        }

    }

}